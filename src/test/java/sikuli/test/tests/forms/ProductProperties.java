package sikuli.test.tests.forms;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import sikuli.test.tests.models.Product;
import utils.StringUtils;
import webdriver.BaseForm;
import webdriver.elements.Label;

import static org.apache.log4j.NDC.getDepth;

public class ProductProperties extends BaseForm {
    private final Label productName = new Label(By.xpath("//div[@id='view-component-info']//div[@class='component-data available']//p[@class='name']"), "Product name");
    private final Label productDimension = new Label(By.xpath("//div[@id='view-component-info']//p[@class='dimensions']"), "Product dimension");
    private final String patternWidth = "W(.+) m ";
    private final String patternDepth = "D(.+) m$";
    private final String patternHeight = "^H(.+) m x W";

    public ProductProperties() {
        super(By.xpath("//div[@id='view-component-info']//p[@class='dimensions']"), "Product properties");
    }

    private Product getProduct() {
        String name = productName.getText();
        String dimensions = productDimension.getText();
        float width = getValueOfDimension(patternWidth, dimensions);
        float depth = getValueOfDimension(patternDepth, dimensions);
        float height = getValueOfDimension(patternHeight, dimensions);
        return new Product(name, width, depth, height);
    }

    /**
     * Return float value of dimension.
     **/
    private float getValueOfDimension(String dimensionNamePattern, String dimensionsString) {
        String stringValue = StringUtils.findPatternInString(dimensionNamePattern, dimensionsString);
        return Float.parseFloat(stringValue);
    }

    /**
     * Check if all product properties isn't empty.
     **/
    public void assertProductPropertiesAreNotEmpty() {
        Product product = getProduct();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(product.getName().length() > 0, "Product name is empty.");
        softAssert.assertTrue(product.getWidth() != 0, String.format("Product width: %s = 0.", product.getWidth()));
        softAssert.assertTrue(product.getDepth() != 0, String.format("Product depth: %s = 0.", product.getDepth()));
        softAssert.assertTrue(product.getHeight() != 0, String.format("Product height: %s = 0.", product.getHeight()));
        softAssert.assertAll();
    }
}