package com.mindtree.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mindtree.model.Channels;
import com.mindtree.model.GlobalRank;
import com.mindtree.model.GroupRank;
import com.mindtree.model.RegionalRank;
import com.mindtree.model.UserResgister;
import com.mindtree.response.DigitalWallResponse;
import com.mindtree.response.GroupRankResponse;
import com.mindtree.response.ItemsResponse;
import com.mindtree.response.LeaderBoardDetailsResponse;
import com.mindtree.response.LeaderBoardResponse;
import com.mindtree.response.OTPDetailResponse;
import com.mindtree.response.OTPResponse;
import com.mindtree.response.PlayListResponse;
import com.mindtree.response.TotalStepsResponse;
import com.mindtree.response.YouTubeResponse;
import com.mindtree.response.YouTubeResponseFinal;
import com.mindtree.response.YouTubeStatusResponse;
import com.mindtree.service.ChannelsService;
import com.mindtree.service.GlobalRankService;
import com.mindtree.service.GroupRankService;
import com.mindtree.service.OTPService;
import com.mindtree.service.RegionalRankService;
import com.mindtree.service.RegistrationService;
import com.mindtree.service.UserStepsService;

import com.mindtree.util.DigitalWallConstant;
import com.mindtree.util.EmailSender;


@RestController
@RequestMapping("/digitalWall")
@CrossOrigin(origins="https://mt20api.westeurope.cloudapp.azure.com:7080")
public class DigitalWallController {
	
	@Autowired
	private UserStepsService userStepService;
	
	@Autowired
	private RegionalRankService regionalRankService;
	
	@Autowired
	private GlobalRankService globalRankService;
	
	@Autowired
	private OTPService otpService;
	
	@Autowired
	private RegistrationService regService;
	
	@Autowired
	EmailSender emailSender;
	
	@Autowired
	private ChannelsService channelsService;
	
	@Autowired
	private GroupRankService groupRankService;
	
	static long emailCount = 0;
	
	private final Logger logger_ = LoggerFactory.getLogger(this.getClass());
	
	/*@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		
		return "Hello" + name + "!";
	}*/
	
	@RequestMapping(method = RequestMethod.GET, value = "/steps/getTotalStepsCount", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public DigitalWallResponse getTotalStepsCount() {
		DigitalWallResponse digitalResp = new DigitalWallResponse();
		TotalStepsResponse stepsResp = new TotalStepsResponse();
		long totalStepCount = 0;
		totalStepCount = userStepService.getTotalStepsCount();
		if(totalStepCount>0) {
		stepsResp.setTotalStepsAchieved(totalStepCount);	
		digitalResp.setStatusCode(DigitalWallConstant.SUCCESSFULL);
		digitalResp.setMessage(DigitalWallConstant.SUCCESSFULL_MESSAGE);
		digitalResp.setTotalStepsDetails(stepsResp);
		return digitalResp;
		}else {
			stepsResp.setTotalStepsAchieved(totalStepCount);	
			digitalResp.setStatusCode(DigitalWallConstant.FAILED);
			digitalResp.setMessage(DigitalWallConstant.FAILED_MESSAGE);
			digitalResp.setTotalStepsDetails(stepsResp);
			return digitalResp;
		}
		
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/getLeaderBoardDetails/{location}", produces = "application/json")
	@ResponseBody
	public LeaderBoardResponse getLeaderBoardDetails(@PathVariable String location) {

		LeaderBoardResponse leaderBoardResp = new LeaderBoardResponse();
		LeaderBoardDetailsResponse leaderBoardDetailsResp = new LeaderBoardDetailsResponse();
		List<GroupRankResponse> groupRankRespList = new ArrayList<>();
		List<GlobalRank> globalRankUsers = new ArrayList<>();
		List<RegionalRank> regionalRankUsers = new ArrayList<>();
		
		//unsorted list
		List<GroupRank> groupRankList = new ArrayList<>();
			globalRankUsers=globalRankService.getTopRunnersGlobally();
		    groupRankList = groupRankList = groupRankService.getGroupList();
			regionalRankUsers = regionalRankService.getTopRunnersLocally(location);
			//Sorting based on steps in descending order
			java.util.Collections.sort(groupRankList,java.util.Collections.reverseOrder());
			int rank=0;
			//Adding Rank to groups
			for(GroupRank gr:groupRankList) {
				
				GroupRankResponse grResp = new GroupRankResponse();
				rank=rank+1;
				grResp.setName(gr.getGroupName());
				grResp.setSteps(gr.getSteps());
				grResp.setRank(rank);
				groupRankRespList.add(grResp);
			}
			
			
			if(globalRankUsers.size()>0&&regionalRankUsers.size()>0) {
			leaderBoardDetailsResp.setTopRunnersLocation(groupRankRespList);
			leaderBoardDetailsResp.setTopRunnersGlobally(globalRankUsers);
			leaderBoardDetailsResp.setTopRunnersLocally(regionalRankUsers);
			leaderBoardResp.setLeaderBoardDetails(leaderBoardDetailsResp);
			
			leaderBoardResp.setStatusCode(DigitalWallConstant.SUCCESSFULL);
			leaderBoardResp.setMessage(DigitalWallConstant.SUCCESSFULL_MESSAGE);
			return leaderBoardResp;

		} else {
			
			leaderBoardDetailsResp.setTopRunnersLocation(groupRankRespList);
			leaderBoardDetailsResp.setTopRunnersGlobally(globalRankUsers);
			leaderBoardDetailsResp.setTopRunnersLocally(regionalRankUsers);
			leaderBoardResp.setLeaderBoardDetails(leaderBoardDetailsResp);
			
			leaderBoardResp.setStatusCode(DigitalWallConstant.FAILED);
			leaderBoardResp.setMessage(DigitalWallConstant.FAILED_MESSAGE);
			return leaderBoardResp;
		}

	}
	@RequestMapping(method = RequestMethod.GET, value = "/user/getLoginOTP/{emailId}", produces = "application/json")
	@ResponseBody
	public OTPResponse getVerificationCode(@PathVariable String emailId) {
		
		OTPResponse otpRes = new OTPResponse();
		OTPDetailResponse otpDetails = new OTPDetailResponse();
		
		if(emailId!=null&&emailId!="") {
			emailId = emailId.trim();
			emailId = emailId.toLowerCase();
			 
			UserResgister user =null;
			user = regService.getUserByEmailId(emailId);
			if(user!=null) {
				String otp = otpService.getOTPByEmailId(emailId);
				String location = user.getLocation();
				
				Map<String, String> mailData = new HashMap<String, String>();
				mailData.put("contactEmail", emailId);
				mailData.put("subject", "One Time Password(OTP) for Mindtree20 Digital Wall");
				mailData.put("body", "<H3>Dear " + user.getFirstName() + ",</H3><br/>Your One Time Password(OTP) for Mindtree20 Digital wall"
						+  ": <H3> " + otp +"</H3><br/>"
						+ "\"The information contained in this electronic message and any attachments to <br/>this message are intended for exclusive use of the addressee(s) and may <br/>"
						+ "contain confidential or privileged information. If you are not the intended<br/>"
						+ "recipient, please notify the sender at noreply@email.com immediately <br/>and destroy all copies of this message");
				
				
				/*String regexCustom = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@mindtree.com$";
				
				Pattern patternCustom = Pattern.compile(regexCustom);

				Matcher matcherCustom = patternCustom.matcher(emailId);*/
				
				try {
					emailCount = emailCount+1;
					emailSender.sendSimpleMessage(mailData,emailCount);
				} catch (Exception e) {
					
					logger_.error("Failed during sending email::"+e);
					otpDetails.setOtp(0);
					otpDetails.setLocation("");
					otpRes.setStatusCode(DigitalWallConstant.FAILED);
					otpRes.setMessage(DigitalWallConstant.FAILED_MAIL_MESSAGE);
					otpRes.setOtpDetails(otpDetails);
					return otpRes;
				}

				otpDetails.setOtp(Long.valueOf(otp));
				otpDetails.setLocation(location);
				otpRes.setStatusCode(DigitalWallConstant.SUCCESSFULL);
				otpRes.setMessage(DigitalWallConstant.SUCCESSFULL_MESSAGE);
				otpRes.setOtpDetails(otpDetails);
				return otpRes;
			}else {
				
				otpDetails.setOtp(0);
				otpDetails.setLocation("");
				otpRes.setStatusCode(DigitalWallConstant.FAILED);
				otpRes.setMessage(DigitalWallConstant.FAILED_USER_MESSAGE);
				otpRes.setOtpDetails(otpDetails);
				return otpRes;
			}
		}else {
			
			otpDetails.setOtp(0);
			otpDetails.setLocation("");
			otpRes.setStatusCode(DigitalWallConstant.FAILED);
			otpRes.setMessage(DigitalWallConstant.FAILED_EMAIL_MESSAGE);
			otpRes.setOtpDetails(otpDetails);
			return otpRes;
		}
		
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/getYouTubeData", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public YouTubeStatusResponse getYoutubeVideos() {
		
		YouTubeStatusResponse ytRes = new YouTubeStatusResponse();
		YouTubeResponseFinal[] currentVideos = null;
		YouTubeResponseFinal[] nextVideos = null;
		
		Channels channels = null;
		channels=channelsService.getChannelsDetails();
		//String current_Channel ="";
		//String next_Channel ="";
		String currentPlayList="";
		String nextPlayList="";
				
		
		
		if(channels!=null) {
		
		 //current_Channel = channels.getCurrentChannel();
		 //next_Channel = channels.getNextChannel();
		 currentPlayList = channels.getCurrentPlayList();
		 nextPlayList = channels.getNextPlayList();
		 PlayListResponse playListResp = new PlayListResponse();
		/* YouTubeResponse cytResponse = new YouTubeResponse();
			RestTemplate restTemplate = new RestTemplate();
			cytResponse = restTemplate.getForObject(
					current_Channel,
					YouTubeResponse.class);
			
			if (cytResponse != null) {
				ItemsResponse itemResponse[] = new ItemsResponse[cytResponse.getItems().length];
				itemResponse = cytResponse.getItems();
				currentVideos=new YouTubeResponseFinal[cytResponse.getItems().length-1];
				for (int i = 0; i < itemResponse.length-1; i++) {
					
					if (itemResponse[i].getId().getVideoId() != null) {
						
						YouTubeResponseFinal cv1 = new YouTubeResponseFinal();
						cv1.setVideoId(itemResponse[i].getId().getVideoId());
						currentVideos[i]=cv1;
					}
				}
				
			} 
			
			YouTubeResponse nytResponse = new YouTubeResponse();
			
			RestTemplate nrestTemplate = new RestTemplate();
			nytResponse = nrestTemplate.getForObject(
					next_Channel,
					YouTubeResponse.class);
			
			if (nytResponse != null) {
				ItemsResponse nitemResponse[] = new ItemsResponse[nytResponse.getItems().length];
				nitemResponse = nytResponse.getItems();
				nextVideos=new YouTubeResponseFinal[nytResponse.getItems().length-1];
				for (int i = 0; i < nitemResponse.length-1; i++) {
					
					if (nitemResponse[i].getId().getVideoId() != null) {
						
						
						YouTubeResponseFinal nv1 = new YouTubeResponseFinal();
						nv1.setVideoId(nitemResponse[i].getId().getVideoId());
						nextVideos[i]=nv1;
					}
				}
				
			} */
			playListResp.setCurrentPlayList(currentPlayList);
			playListResp.setNextPlayList(nextPlayList);
			ytRes.setPlayLists(playListResp);
			//ytRes.setCurrentChannelVideos(currentVideos);
			//ytRes.setNextChannelVideos(nextVideos);
			ytRes.setStatusCode(DigitalWallConstant.SUCCESSFULL);
			ytRes.setMessage(DigitalWallConstant.SUCCESSFULL_MESSAGE);
			return ytRes;
		}else {
			
			ytRes.setStatusCode(DigitalWallConstant.FAILED);
			ytRes.setMessage(DigitalWallConstant.FAILED_MESSAGE);
			return ytRes;
		}
	
	}
}
