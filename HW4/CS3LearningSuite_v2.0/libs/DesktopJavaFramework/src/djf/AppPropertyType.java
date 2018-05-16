package djf;

/**
 * This enum provides properties that are to be loaded via
 * XML files to be used for setting up the application. Note
 * that this enum can only be used for things known to the
 * Desktop Java Framework.
 * 
 * @author Richard McKenna
 * @version 1.0
 */
public enum AppPropertyType {
    // LOADED PROGRAMMICALLY AT THE START OF THE APPLICATION
    // AND THEN OVERRIDDEN BY LANGUAGE-SPECIFIC XML FILES
    APP_ERROR_TITLE,        APP_ERROR_CONTENT,
    PROPERTIES_ERROR_TITLE, PROPERTIES_ERROR_CONTENT,

    // THESE ARE THE FOOLPROOF DESIGN SETTINGS FOR THE GUI
    // THAT DJF CAN PROVIDE IF DESIRED. NOTE THEY MAY
    // ALSO BE OVERRIDDEN
    APP_FILE_FOOLPROOF_SETTINGS,
    APP_CLIPBOARD_FOOLPROOF_SETTINGS,
    APP_UNDO_FOOLPROOF_SETTINGS,
       
    // FOR GETTING THE LIST OF LANGUAGE CHOICES
    LANGUAGE_OPTIONS,
    DEFAULT_LANGUAGE,
    LANGUAGE_DIALOG_TITLE,
    LANGUAGE_DIALOG_HEADER_TEXT,
    LANGUAGE_DIALOG_CONTENT_TEXT,

    // INITIAL WINDOW TITLE AND LOGO
    APP_TITLE,
    APP_BANNER,
    APP_LOGO,
    APP_EXPORT_PAGE,
    APP_HELP_PAGE,
    APP_ABOUT_PAGE,
    APP_CSS,
    APP_PATH_CSS,
    APP_PATH_EXPORT,
    APP_PATH_IMAGES,
    APP_PATH_ICONS,
    APP_PATH_WEB,
    WORK_FILE_EXT,
    WORK_FILE_EXT_DESC,
    PREF_WIDTH,
    PREF_HEIGHT,
    START_MAXIMIZED,
    CLOSE_BUTTON_TEXT,    
    
    // FOR THE WELCOME DIALOG
    WELCOME_DIALOG_TITLE,
    WELCOME_DIALOG_RECENT_WORK_LABEL,
    WELCOME_DIALOG_NEW_BUTTON_TEXT,
    WELCOME_DIALOG_IMAGE_PATH,
    
    // FOR DETERMINING WHICH UI FEATURES ARE BEING USED
    HAS_WELCOME_DIALOG,
    HAS_TOP_TOOLBAR,
    HAS_FILE_TOOLBAR, HAS_CLIPBOARD_TOOLBAR, HAS_UNDO_TOOLBAR, HAS_HELP_TOOLBAR,
    HAS_NEW, HAS_LOAD, HAS_CLOSE, HAS_SAVE, HAS_EXPORT, HAS_EXIT,
    HAS_HELP, HAS_LANGUAGE, HAS_ABOUT,

    // FILE TOOLBAR CONTROLS
    NEW_BUTTON, LOAD_BUTTON, CLOSE_BUTTON, SAVE_BUTTON, EXPORT_BUTTON, EXIT_BUTTON,
    
    // CLIPBOARD TOOLBAR CONTROLS
    CUT_BUTTON, COPY_BUTTON, PASTE_BUTTON,
    
    // UNDO TOOLBAR CONTROLS
    UNDO_BUTTON, REDO_BUTTON,
    
    // HELP TOOLBAR CONTROLS
    HELP_BUTTON, LANGUAGE_BUTTON, ABOUT_BUTTON,
    
    // LOADED FROM LANGUAGE SPECIFIC language_properties_XX.xml
    // WHERE XX WOULD BE THE LANGUAGE CODE, LIKE EN (English)
    
    // NEW FEEDBACK DIALOGS
    NEW_SUCCESS_TITLE,  NEW_SUCCESS_CONTENT,
    NEW_ERROR_TITLE,    NEW_ERROR_CONTENT,
    
    // LOAD FEEDBACK DIALOGS
    LOAD_WORK_TITLE,    
    LOAD_SUCCESS_TITLE, LOAD_SUCCESS_CONTENT,
    LOAD_ERROR_TITLE,   LOAD_ERROR_CONTENT,
    
    // SAVE FEEDBACK DIALOGS
    SAVE_WORK_TITLE,    
    SAVE_SUCCESS_TITLE, SAVE_SUCCESS_CONTENT,
    SAVE_ERROR_TITLE,   SAVE_ERROR_CONTENT,
    SAVE_VERIFY_TITLE,  SAVE_VERIFY_CONTENT,
    
    // EXPORT FEEDBACK DIALOGS
    EXPORT_ERROR_TITLE, EXPORT_ERROR_CONTENT,

    // HELP/ABOUT DIALOGS
    HELP_DIALOG_ERROR_TITLE,    HELP_DIALOG_ERROR_CONTENT,
    ABOUT_DIALOG_ERROR_TITLE,   ABOUT_DIALOG_ERROR_CONTENT
}