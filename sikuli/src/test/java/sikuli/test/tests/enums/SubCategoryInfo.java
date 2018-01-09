package sikuli.test.tests.enums;

public enum SubCategoryInfo {
    DiningRoom("new-1849");
    private String subCategoryId;

    public String getSubCategoryId() {
        return subCategoryId;
    }

    SubCategoryInfo(String subCategoryId) {
        this.subCategoryId = subCategoryId;
    }
}
