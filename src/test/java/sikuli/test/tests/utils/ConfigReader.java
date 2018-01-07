package sikuli.test.tests.utils;

import sikuli.test.tests.forms.SubCategoryInfo;
import webdriver.PropertiesResourceManager;

public class ConfigReader {
    private static final String SIKULI_PROPERTIES_FILE = "sikuli_project.properties";
    private static final PropertiesResourceManager PROPS = new PropertiesResourceManager(SIKULI_PROPERTIES_FILE);
    private final static String PROPERTY_NAME_CATEGORY_NAME = "category_name";
    private final static String PROPERTY_NAME_SUB_CATEGORY_NAME = "sub_category_name";
    private final static String PROPERTY_NAME_PATH_TO_PIC_FOLDER = "path_to_pic_folder";
    private final static String PROPERTY_NAME_ITEM_FILE_NAME = "item_file_name";
    private final static String PROPERTY_NAME_VERIFY_DROP_FILE_NAME = "verify_drop_file_name";
    private final static String PROPERTY_NAME_DELETE_ITEM_FILE_NAME = "delete_item_file_name";
    public static final String CATEGORY_NAME = PROPS.getProperty(PROPERTY_NAME_CATEGORY_NAME);
    public static final String SUB_CATEGORY_NAME = PROPS.getProperty(PROPERTY_NAME_SUB_CATEGORY_NAME);
    public static final String PATH_TO_PIC_FOLDER = PROPS.getProperty(PROPERTY_NAME_PATH_TO_PIC_FOLDER);
    public static final String ITEM_FILE_NAME = PROPS.getProperty(PROPERTY_NAME_ITEM_FILE_NAME);
    public static final String VERIFY_DROP_FILE_NAME = PROPS.getProperty(PROPERTY_NAME_VERIFY_DROP_FILE_NAME);
    public static final String DELETE_ITEM_FILE_NAME = PROPS.getProperty(PROPERTY_NAME_DELETE_ITEM_FILE_NAME);

    public static String getSubCategoryId() {
        switch (SUB_CATEGORY_NAME) {
            case "Dining room":
                return SubCategoryInfo.DiningRoom.getSubCategoryId();
            default:
                throw new AssertionError("Unknown subcategory name" + SUB_CATEGORY_NAME);
        }
    }
}
