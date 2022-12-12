package service;

import classes.Person;

import java.util.List;

public class PersonServicesAble {
    String greateWhatsappAccount(WhatSappUser whatsappUzers, List<Person>people);
    List<WhatSappUser>getWhatsappUzer();
    WhatSappUser getProfil(String pasword, List<WhatSappUser>whatsappUzers);
    String getMAssege(String password, String name, List<String> massege, List<WhatSappUser>uzers, List<WhatSappUser>uzers2);

}
