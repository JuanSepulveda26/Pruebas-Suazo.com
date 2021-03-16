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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.renfe.com/es/es')

WebUI.click(findTestObject('Object Repository/Page_Renfe  Billetes de tren Ave, Avlo al m_12e72f/button_Aceptar todas las cookies'))

WebUI.click(findTestObject('Object Repository/Page_Renfe  Billetes de tren Ave, Avlo al m_12e72f/span_Viajar'))

WebUI.click(findTestObject('Object Repository/Page_Renfe  Billetes de tren Ave, Avlo al m_12e72f/a_Mis viajes'))

WebUI.setText(findTestObject('Object Repository/Page_Renfe - Mis Viajes/input_CONSULTA POR LOCALIZADOR_locCode'), '123456789')

WebUI.setText(findTestObject('Object Repository/Page_Renfe - Mis Viajes/input_TIPO DE DOCUMENTO_originDesc'), 'El ROMERAL')

WebUI.sendKeys(findTestObject('Object Repository/Page_Renfe - Mis Viajes/input_TIPO DE DOCUMENTO_originDesc'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Renfe - Mis Viajes/input_DOCUMENTO_destinDesc'), 'AVILA')

WebUI.sendKeys(findTestObject('Object Repository/Page_Renfe - Mis Viajes/input_DOCUMENTO_destinDesc'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Renfe - Mis Viajes/input_FECHA DE VIAJE_travelDate'), '30/12/2021')

WebUI.click(findTestObject('Object Repository/Page_Renfe - Mis Viajes/input_FECHA DE VIAJE_travelDate - copy'))

WebUI.setText(findTestObject('Object Repository/Page_Renfe - Mis Viajes/input_FECHA DE VIAJE_email'), 'juans.sepulveda@ecci.edu.co')

WebUI.closeBrowser()

