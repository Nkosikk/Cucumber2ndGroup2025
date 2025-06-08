package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReusableFunctions {

    public WebDriver driver;


    public String cellValue(String name){
        List<WebElement> rows = driver.findElement(By.tagName("table")).findElements(By.tagName("tr"));
        // Loop through rows
        for(WebElement row : rows){
            // Extract columns (cells) from each row
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for(WebElement cell : cells){
                if (cell.getText().equals(name)){
                    return cell.getText();
                }
            }
        }
        return "Value was not found";
    }

}