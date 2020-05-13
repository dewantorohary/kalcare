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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.kalcare.com/')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Kalcare/span_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_Kalcare/input_Alamat email nomor member KF atau nom_8703c2'), 'harydewantoro@rocketmail.com')

WebUI.click(findTestObject('Object Repository/Page_Kalcare/span_Selanjutnya'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Kalcare/input_Kata Sandi_password'), 'ni7IXepu1na8tM3UQRp1Bg==')

WebUI.click(findTestObject('Page_Kalcare/Page_Kalcare/button_Masuk'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Kalcare/input_KATEGORI BELANJA_MuiInputBase-input jss157'), 'Chil School Platinum Moricare+ Chocolate 800gr')

WebUI.click(findTestObject('Object Repository/Page_Kalcare/span_Cari'))

WebUI.delay(5)

WebUI.click(findTestObject('new button/Page_Kalcare/h2_Chil School Platinum Moricare Chocolate 800gr'))

WebUI.click(findTestObject('new button/Page_chil kid gold vanilla 800gr chil go/button_Pilih Dulu'))

WebUI.click(findTestObject('new button/Page_chil kid gold vanilla 800gr chil go/button_Beli Sekarang'))

WebUI.click(findTestObject('new button/Page_Kalcare/button_Beli'))

not_run: WebUI.delay(5)

WebUI.click(findTestObject('new button/Page_Kalcare/button_Pilih Pengiriman'))

WebUI.click(findTestObject('new button/Page_Kalcare/div__MuiSkeleton-root MuiSkeleton-rect jss1148 MuiSkeleton-pulse'))

WebUI.click(findTestObject('new button/Page_Kalcare/button_Pembayaran'))

WebUI.click(findTestObject('Object Repository/Page_Kalcare/span_Cara Pembayaran'))

WebUI.click(findTestObject('new button/Page_Kalcare/input__jss2911'))

WebUI.click(findTestObject('new button/Page_Kalcare/button_Proses Pesanan'))

