import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://phptravels.com/demo')
WebUI.maximizeWindow()


WebUI.waitForPageLoad(3)

int RandomValue = new Random().nextInt()

'Input First Name'
WebUI.setText(findTestObject('Exercise2/txtFirstName'), 'First Name' + RandomValue.toString())

'Input Last Name'
WebUI.setText(findTestObject('Exercise2/txtLastName'), 'Last Name' + RandomValue.toString())

'Input Business Name'
WebUI.setText(findTestObject('Exercise2/txtBusinessName'), 'Business Name' + RandomValue.toString())

'Input email'
WebUI.setText(findTestObject('Exercise2/txtEmail'), ('duy.npd+' + RandomValue.toString()) + '@neo-lab.vn')

'Get number 1'
number1 = WebUI.getText(findTestObject('Exercise2/number1'))

'Get number 2'
number2 = WebUI.getText(findTestObject('Exercise2/number2'))

'Perform the math'
int resultMath = Integer.parseInt(number1) + Integer.parseInt(number2)

'Input the result into textField'
WebUI.setText(findTestObject('Exercise2/txtMathResult'), resultMath.toString())

'Click button Submit'
WebUI.click(findTestObject('Exercise2/btnSubmit'))

WebUI.waitForPageLoad(3)

WebUI.verifyTextPresent('Thank you', false)

WebUI.closeBrowser()

