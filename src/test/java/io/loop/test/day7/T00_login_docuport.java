package io.loop.test.day7;

import io.loop.test.Utilities.DocuportConstants;
import io.loop.test.Utilities.DocuportUtils;
import io.loop.test.base.TestBase;
import org.testng.annotations.Test;

public class T00_login_docuport extends TestBase {
    @Test
    public void test_login_logout_docuport() throws InterruptedException {
        DocuportUtils.login(driver,DocuportConstants.CLIENT);
        DocuportUtils.logout(driver);

        Thread.sleep(1000);

        DocuportUtils.login(driver,DocuportConstants.CLIENT);
        DocuportUtils.logout(driver);

    }


}
