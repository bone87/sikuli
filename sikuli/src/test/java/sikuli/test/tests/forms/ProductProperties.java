package sikuli.test.tests.forms;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import sikuli.test.tests.models.Product;
import webdriver.BaseForm;
import webdriver.CommonFunctions;
import webdriver.elements.Label;

public class ProductProperties extends BaseForm {
    private final Label lblProductName = new Label(By.xpath("//div[@id='view-component-info']//div[@class='component-data available']//p[@class='name']"), "product name");
    private final Label lblProductDimension = new Label(By.xpath("//div[@id='view-component-info']//p[@class='dimensions']"), "product dimensions");

    public ProductProperties() {
        super(By.xpath("//div[@id='view-component-info']//p[@class='dimensions']"), "product properties");
    }

    private Product getProduct() {
        String name = lblProductName.getText();
        String dimensions = lblProductDimension.getText();
        String patternWidth = "W(.+) m ";
        float width = getValueOfDimension(patternWidth, dimensions);
        String patternDepth = "D(.+) m$";
        float depth = getValueOfDimension(patternDepth, dimensions);
        String patternHeight = "^H(.+) m x W";
        float height = getValueOfDimension(patternHeight, dimensions);
        return new Product(name, width, depth, height);
    }

    /**
     * Return float value of dimension.
     **/
    private float getValueOfDimension(String dimensionNamePattern, String dimensionsString) {
        String stringValue = CommonFunctions.regexGetMatchGroup(dimensionsString, dimensionNamePattern, 1);
        return Float.parseFloat(stringValue);
    }

    /**
     * Check if all product properties aren't empty.
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