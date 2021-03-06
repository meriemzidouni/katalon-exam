import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import net.bytebuddy.implementation.bytecode.constant.NullConstant as NullConstant
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
/**/
WebUI.callTestCase(findTestCase('Common/GoToUrl'), [('url') : GlobalVariable.homeUrl + '?controller=addresses'])

WebUI.click(findTestObject('Object Repository/Page_Addresses - My Store/Page_Addresses - My Store/span_Add a new address'))

WebUI.setText(findTestObject('Object Repository/Page_Addresses - My Store/Page_Address - My Store/input__address1'), Adress)

WebUI.setText(findTestObject('Object Repository/Page_Addresses - My Store/Page_Address - My Store/input__city'), City)

WebUI.selectOptionByValue(findTestObject('Page_Addresses - My Store/Page_Address - My Store/select_-AlabamaAlaskaArizonaAr'), 
    State, true)

WebUI.setText(findTestObject('Object Repository/Page_Addresses - My Store/Page_Address - My Store/input__postcode'), ZipCode)

WebUI.setText(findTestObject('Object Repository/Page_Addresses - My Store/Page_Address - My Store/input__phone'), HomePhone)

WebUI.setText(findTestObject('Object Repository/Page_Addresses - My Store/Page_Address - My Store/input__alias'), AliasRef)

WebUI.click(findTestObject('Object Repository/Page_Addresses - My Store/Page_Address - My Store/span_Save'))

