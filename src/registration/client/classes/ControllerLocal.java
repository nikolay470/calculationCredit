package registration.client.classes;

import registration.client.interfaces.CurrentLocal;

public class ControllerLocal {
    private static CurrentLocal ru_local;

    public static CurrentLocal getRuLocal() {
        if (ru_local == null) {
            ru_local = new RU_local();
            return ru_local;
        } else {
            return ru_local;
        }
    }

    private static class RU_local implements CurrentLocal{
        private String[] langRU;

        private RU_local() {
            init();
        }

        private void init() {
            langRU = new String[]{"а", "б", "в", "г", "д", "е", "ё",
                    "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у",
                    "ф", "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я"};
        }

        public String[] getLang() {
            return this.langRU;
        }
    }
}
