package service.impl;

public interface WhatsappUzerServices {
    public class WhatsappUzerServices implements WhatsappUzerAble {
        List<WhatSappUser>whatsappUzers = new ArrayList<>();
        List<String>whatsappMassege = new ArrayList<>();

        @Override
        public String greateWhatsappAccount(WhatSappUser whatsappUzer, List<Person>people) {
            if (whatsappUzer.getId()!=0){
                this.whatsappUzers.add(whatsappUzer);
                return "УСПЕШНО!!!";
            }else {
                return "АКАУНТ НЕ СОЗДАН!!!";
            }


        }

        @Override
        public List<WhatSappUser> getWhatsappUzer() {
            return this.whatsappUzers;
        }

        @Override
        public WhatSappUser getProfil(String pasword, List<WhatSappUser> whatsappUzers) {
            for (WhatSappUser whatsappUzer : whatsappUzers) {
                if(whatsappUzer.getPassword().equals(pasword)){
                    return whatsappUzer;
                }
            }
            return null;
        }

        @Override
        public String getMAssege(String password, String name, List<String> massege, List<WhatSappUser> uzers, List<WhatSappUser>uzers2) {
            for (WhatSappUser uzer : uzers) {

                for (WhatSappUser whatsappUzer : uzers2) {
                    if (uzer.getPassword().equals(password)) {
                        if (whatsappUzer.getUserName().equals(name)) {
                            whatsappMassege.add(uzer.getUserName()+" : "+massege);

                            whatsappUzer.setMassege((ArrayList<String>) this.whatsappMassege);
                            return "СОБШЕННИЕ ОТПРАВЛЕННО!!";

                        }

                    }
                }
            }
            return null;
        }
}
