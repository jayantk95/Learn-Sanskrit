package com.example.learn_sanskrit;

public class Word {
    //sanskrit translation of word
    private final String sanskritTranslation;

    // The way to write word in sanskrit
    private final String writtenInSanskrit;

    //default translation of sanskrit word
    private final String defaultTranslation;

    //Resource ID of image to be displayed
    private int imageResourceID;

    /**
     * Creates word object with respective translations and image
     *
     * @param defaultTranslation  translation in default language, here english
     * @param sanskritTranslation given word in sanskrit
     * @param writtenInSanskrit   word written in sanskrit
     * @param imageResourceID     resource id of image to be associated
     */
    public Word(String sanskritTranslation, String writtenInSanskrit, String defaultTranslation,
                int imageResourceID) {
        this.sanskritTranslation = sanskritTranslation;
        this.writtenInSanskrit = writtenInSanskrit;
        this.defaultTranslation = defaultTranslation;
        this.imageResourceID = imageResourceID;
    }

    /**
     * Creates word object with respective translations, to be used in case of phrases
     *
     * @param defaultTranslation  translation in default language, here english
     * @param sanskritTranslation given word in sanskrit
     * @param writtenInSanskrit   word written in sanskrit
     **/
    public Word(String sanskritTranslation, String writtenInSanskrit, String defaultTranslation) {
        this.sanskritTranslation = sanskritTranslation;
        this.writtenInSanskrit = writtenInSanskrit;
        this.defaultTranslation = defaultTranslation;
    }

    //get sanskritTranslation of word
    public String getSanskritTranslation() {
        return sanskritTranslation;
    }

    //get word written in sanskrit
    public String getWrittenInSanskrit() {
        return writtenInSanskrit;
    }

    //get default translation of word
    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    //get resource id of image associated
    public int getImageResourceID() {
        return imageResourceID;
    }

}
