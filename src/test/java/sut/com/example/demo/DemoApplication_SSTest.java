/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.example.demo;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.runtime.SmartAssertions.*;
import com.example.demo.DemoApplication;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class DemoApplication_SSTest extends DemoApplication_SSTest_scaffolding {
// allCoveredLines:[8, 11]

  @Test(timeout = 9000)
  public void test_main_0()  throws Throwable  {
      //caseID:481e380fef7b938512bfda1f1011d9f8
      //CoveredLines: [8, 11]
      //Input_0_String[]: stringArray0
      
      DemoApplication demoApplication0 = new DemoApplication();
      String[] stringArray0 = new String[0];
      
      //Call method: main
      // Undeclared exception!
      try { 
        DemoApplication.main(stringArray0);
      } catch(Throwable e) {
      }
  }
}
