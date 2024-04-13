/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.example.demo.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.example.demo.controller.UserController;
import com.example.demo.model.UserInfo;
import com.example.demo.model.UserInfoRequest;
import com.example.demo.model.UserInfoResponse;
import com.example.demo.service.UserService;
import java.util.LinkedList;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class UserController_SSTest extends UserController_SSTest_scaffolding {
// allCoveredLines:[23, 30, 31, 32, 33, 34, 36, 37, 38, 39]

  @Test(timeout = 9000)
  public void test_getUserInfo_0()  throws Throwable  {
      //caseID:22501c568b506916e414e86add8a1d35
      //CoveredLines: [23, 30, 31, 32, 33, 34]
      //Input_0_UserInfoRequest: null
      //Assert: assertEquals(0, (int)method_result.getRowCount());
      
      UserController userController0 = new UserController();
      
      //Call method: getUserInfo
      UserInfoResponse userInfoResponse0 = userController0.getUserInfo((UserInfoRequest) null);
      
      //Test Result Assert
      assertEquals(0, (int)userInfoResponse0.getRowCount());
  }

  @Test(timeout = 9000)
  public void test_getUserInfo_1()  throws Throwable  {
      //caseID:20fbd1606dbe6989940dd0d887e529f4
      //CoveredLines: [23, 30, 31, 32, 33, 34]
      //Input_0_UserInfoRequest: {}
      //Assert: assertEquals(0, (int)method_result.getRowCount());
      
      UserController userController0 = new UserController();
      //mock userInfoRequest0
      UserInfoRequest userInfoRequest0 = mock(UserInfoRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: getUserInfo
      UserInfoResponse userInfoResponse0 = userController0.getUserInfo(userInfoRequest0);
      
      //Test Result Assert
      assertEquals(0, (int)userInfoResponse0.getRowCount());
  }

  @Test(timeout = 9000)
  public void test_getUserInfo_2()  throws Throwable  {
      //caseID:b3cb1a44b25b0012e5f9e2bc9c666a50
      //CoveredLines: [23, 30, 31, 36, 37, 38, 39]
      //Input_0_UserInfoRequest: {getUserId=1}
      //Assert: assertNull(method_result.getErrorNo());
      
      UserController userController0 = new UserController();
      LinkedList<UserInfo> linkedList0 = new LinkedList<UserInfo>();
      //mock userService0
      UserService userService0 = mock(UserService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(linkedList0).when(userService0).userInfoHandler(any(com.example.demo.model.UserInfoRequest.class));
      
      PrivateAccess.setVariable((Class<?>) UserController.class, userController0, "userService", (Object) userService0);
      Integer integer0 = new Integer(1);
      //mock userInfoRequest0
      UserInfoRequest userInfoRequest0 = mock(UserInfoRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0).when(userInfoRequest0).getUserId();
      
      //Call method: getUserInfo
      UserInfoResponse userInfoResponse0 = userController0.getUserInfo(userInfoRequest0);
      
      //Test Result Assert
      assertNull(userInfoResponse0.getErrorNo());
  }
}
