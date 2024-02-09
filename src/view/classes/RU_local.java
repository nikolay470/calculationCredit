package view.classes;

import view.interfaces.CurrentLocal;

public class RU_local implements CurrentLocal {
    private static RU_local local;
    private String[] langRU;

    private RU_local() {
        init();
    }

    private void init() {
        langRU = new String[]{"а", "б", "в", "г", "д", "е", "ё",
                "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у",
                "ф", "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я"};
    }

    public static RU_local getLocal() {
        if (local == null) {
            local = new RU_local();
            return local;
        } else {
            return local;
        }
    }

    public String[] getLang() {
        return this.langRU;
    }
}
