package case_study_james.models;

public class Dictionary {
    private String nameOfWord;
    private String pronounce;
    private String typeOfWord;
    private String similarWord;

    public Dictionary(String nameKey, String pronounce, String type, String similar) {
        this.nameOfWord = nameKey;
        this.pronounce = pronounce;
        this.typeOfWord = type;
        this.similarWord = similar;
    }

    public Dictionary() {

    }

    public String getNameOfWord() {
        return nameOfWord;
    }

    public void setNameOfWord(String nameOfWord) {
        this.nameOfWord = nameOfWord;
    }

    public String getPronounce() {
        return pronounce;
    }

    public void setPronounce(String pronounce) {
        this.pronounce = pronounce;
    }

    public String getTypeOfWord() {
        return typeOfWord;
    }

    public void setTypeOfWord(String typeOfWord) {
        this.typeOfWord = typeOfWord;
    }

    public String getSimilarWord() {
        return similarWord;
    }

    public void setSimilarWord(String similarWord) {
        this.similarWord = similarWord;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "nameOfWord='" + nameOfWord + '\'' +
                ", pronounce='" + pronounce + '\'' +
                ", typeOfWord='" + typeOfWord + '\'' +
                ", similarWord='" + similarWord + '\'' +
                '}';
    }
}
