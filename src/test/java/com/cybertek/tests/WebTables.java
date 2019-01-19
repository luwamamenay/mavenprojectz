package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTables extends TestBase {


    @Test
    public void printWholeTabele() {
        login();

        WebElement table  =driver.findElement(By.id("ctl00_MainContent_orderGrid")) ;
        System.out.println(table.getText());


    }
    //printing the whole tablle
    public void login(){
        driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/" );
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");


        driver.findElement(By.id("ctl00_MainContent_password")).
        sendKeys("test"+ Keys.ENTER);



    }
//printing the headers of the table
    @Test
    public void printAllHeader(){
       login();

        List<WebElement>headers =driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//th"));

        for (WebElement header :headers) {
            System.out.println(header.getText());
        }

    }

    //printing the number row
    //printing the whole row
    //printing crtain raw using index

    @Test
    public void printrow(){
        login();
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
        System.out.println("number of rows "+allRows.size());


        for (WebElement header:allRows) {
            System.out.println(header.getText());

        }

        System.out.println("printing row "+ 3);
        System.out.println(allRows.get(2).getText());
    }
    @Test

       public  void printTableSize(){
          login();

          //getting the size of rows
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
        System.out.println("number of rows "+allRows.size());

       //findig the colum we simply have to find how many headers we have and cells


        List<WebElement>allheaders =driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[1]/th"));

        System.out.println("number of columns(cols)"+ allheaders.size());
    }

  //print a row without using list

    @Test
    public  void printRow2(){
        login();

       WebElement certainrow = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[5]"));

        System.out.println("printing with out list "+ certainrow.getText());


    }

//print all the cells in a row whose index is given in xpath
   @Test
    public void printAllTheCellsInARow(){
        login();

      //List<WebElement>  cellsInARow =driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td"));
       List<WebElement> cells = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td"));

       for (WebElement header:cells){
           System.out.println(header.getText());
       }
   }

  //finding the rows and columns in a table using index in a given xpath
//print by coordinates :based on a row and column number

    @Test
    public void printByCoordinates(){

       login();

       WebElement cell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[3]/td[3]"));
        System.out.println("printing by coordinates "+ cell.getText());

        System.out.println("printing rows and cols" +getcell(6,11).getText());

    }

    public WebElement getcell(int row ,int col){
        login();

      String xpath ="//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+row+"]/td["+col+"]";
      return driver.findElement(By.xpath(xpath));
    }

    //print all the values in single line
    @Test
    public void printColumn(){

        login();

        List<WebElement> singleline = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
       for(WebElement header :singleline){
           System.out.println(header.getText());
       }

    }
//find the selcet checkbox for a given name
    @Test
    public  void selectCheckBox(){
        login();
        WebElement checkBpx =driver.findElement(By.xpath("//td[.='Mark Smith']/../td[1]//input"));
        System.out.println(checkBpx.isSelected());
        checkBpx.click();
        System.out.println("check box ix selscted" + checkBpx.isSelected());

    }
   //verify that names "Mark Smith " exist in the name column
   //verify that city "Whitestone"exist in cities colomun
   @Test
   public void test(){
       login();
       int nameIndex = getColumnIndex("Name");
       System.out.println(nameIndex);
       List<WebElement> allnames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td["+nameIndex+"]"));


       boolean found =false;
       for (int i = 0; i < allnames.size(); i++) {
           if(allnames.get(i).getText().equals("Mark Smith")){
               //pass
               found=true;
               break;
           }

       }
       Assert.assertTrue(found);

       found =false;
       int cityIndex = getColumnIndex("City");
       System.out.println(cityIndex);
       List<WebElement> allcities = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td["+cityIndex+"]"));
       for (int i = 0; i <allcities.size(); i++) {
           if(allcities.get(i).getText().equals("Whitestone, British")){
               found =true;
               break;
           }
       }

       Assert.assertTrue(found);

   }

    /*
    get a column name as parameters
    returns the index of column name
     */
    public int getColumnIndex(String column) {
        List<WebElement> allheaders = driver.findElements(
                By.xpath("//table[@id='ctl00_MainContent_orderGrid']//th"));


        for (int i = 0; i < allheaders.size(); i++) {
            if (allheaders.get(i).getText().equalsIgnoreCase(column)) {
                return i + 1;
            }
        }

        return 0;

    }
}
//th is for header
//td is for cols