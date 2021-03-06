package com.example.capstona_a;

import android.widget.ImageView;

public class Util {

    private static final String VERSION = "11.18.1";

    private static final String ITEM_IMG_URL = "https://ddragon.leagueoflegends.com/cdn/" + VERSION + "/img/item/";
    private static final String PROFILE_IMG_URL = "https://ddragon.leagueoflegends.com/cdn/" + VERSION + "/img/profileicon/";
    private static final String CHAMP_IMG_URL = "https://ddragon.leagueoflegends.com/cdn/img/champion/tiles/";
    private static final String SPELL_IMG_URL = "https://ddragon.leagueoflegends.com/cdn/" + VERSION + "/img/spell/";

    protected static String API_KEY() {
        return "RGAPI-df6e0fe8-e1d7-49ed-9f0c-b14a10fc50f1";
    }

    public static String getSpellImgSrc(String spell) {
        return SPELL_IMG_URL + spell + ".png";
    }

    public static String getItemImgSrc(Long item) {
        return ITEM_IMG_URL + item + ".png";
    }

    public static String getProfileImgSrc(int profileIconId) {
        return PROFILE_IMG_URL + profileIconId + ".png";
    }

    public static String getChampImgSrc(String champName, int number) {
        return CHAMP_IMG_URL + champName + "_" + number + ".jpg";
    }
    public static String changeSpellcodetoSpellName(int spell){
        String name=null;
        switch(spell){
            case 21:
                name="SummonerBarrier";
                break;
            case 1:
                name="SummonerBoost";
                break;
            case 14:
                name="SummonerDot";
                break;
            case 3:
                name="SummonerExhaust";
                break;
            case 4:
                name="SummonerFlash";
                break;
            case 6:
                name="SummonerHaste";
                break;
            case 7:
                name="SummonerHeal";
                break;
            case 13:
                name="SummonerMana";
                break;
            case 30:
                name="SummonerPoroRecall";
                break;
            case 31:
                name="SummonerPoroThrow";
                break;
            case 11:
                name="SummonerSmite";
                break;
            case 12:
                name="SummonerTeleport";
                break;
        }
        return name;
    }

    public static String changeChampionIdToName(int champCode) {
        String id = null;
        switch (champCode) {
            case 266:
                id = "Aatrox";
                break; // ????????? ?????? ??????
            case 412:
                id = "Thresh";
                break;
            case 23:
                id = "Tryndamere";
                break;
            case 79:
                id = "Gragas";
                break;
            case 69:
                id = "Cassiopeia";
                break;
            case 136:
                id = "AurelionSol";
                break;
            case 13:
                id = "Ryze";
                break;
            case 78:
                id = "Poppy";
                break;
            case 14:
                id = "Sion";
                break;
            case 1:
                id = "Annie";
                break;
            case 202:
                id = "Jhin";
                break;
            case 43:
                id = "Karma";
                break;
            case 111:
                id = "Nautilus";
                break;
            case 240:
                id = "Kled";
                break;
            case 99:
                id = "Lux";
                break;
            case 103:
                id = "Ahri";
                break;
            case 2:
                id = "Olaf";
                break;
            case 112:
                id = "Viktor";
                break;
            case 34:
                id = "Anivia";
                break;
            case 27:
                id = "Singed";
                break;
            case 86:
                id = "Garen";
                break;
            case 127:
                id = "Lissandra";
                break;
            case 57:
                id = "Maokai";
                break;
            case 25:
                id = "Morgana";
                break;
            case 28:
                id = "Evelynn";
                break;
            case 105:
                id = "Fizz";
                break;
            case 74:
                id = "Heimerdinger";
                break;
            case 238:
                id = "Zed";
                break;
            case 68:
                id = "Rumble";
                break;
            case 82:
                id = "Mordekaiser";
                break;
            case 37:
                id = "Sona";
                break;
            case 96:
                id = "KogMaw";
                break;
            case 55:
                id = "Katarina";
                break;
            case 117:
                id = "Lulu";
                break;
            case 22:
                id = "Ashe";
                break;
            case 30:
                id = "Karthus";
                break;
            case 12:
                id = "Alistar";
                break;
            case 122:
                id = "Darius";
                break;
            case 67:
                id = "Vayne";
                break;
            case 110:
                id = "Varus";
                break;
            case 77:
                id = "Udyr";
                break;
            case 89:
                id = "Leona";
                break;
            case 126:
                id = "Jayce";
                break;
            case 134:
                id = "Syndra";
                break;
            case 80:
                id = "Pantheon";
                break;
            case 92:
                id = "Riven";
                break;
            case 121:
                id = "Khazix";
                break;
            case 42:
                id = "Corki";
                break;
            case 268:
                id = "Azir";
                break;
            case 51:
                id = "Caitlyn";
                break;
            case 76:
                id = "Nidalee";
                break;
            case 85:
                id = "Kennen";
                break;
            case 3:
                id = "Galio";
                break;
            case 45:
                id = "Veigar";
                break;
            case 432:
                id = "Bard";
                break;
            case 150:
                id = "Gnar";
                break;
            case 90:
                id = "Malzahar";
                break;
            case 104:
                id = "Graves";
                break;
            case 254:
                id = "Vi";
                break;
            case 10:
                id = "Kayle";
                break;
            case 39:
                id = "Irelia";
                break;
            case 64:
                id = "LeeSin";
                break;
            case 420:
                id = "Illaoi";
                break;
            case 60:
                id = "Elise";
                break;
            case 106:
                id = "Volibear";
                break;
            case 20:
                id = "Nunu";
                break;
            case 4:
                id = "TwistedFate";
                break;
            case 24:
                id = "Jax";
                break;
            case 102:
                id = "Shyvana";
                break;
            case 429:
                id = "Kalista";
                break;
            case 36:
                id = "DrMundo";
                break;
            case 427:
                id = "Ivern";
                break;
            case 131:
                id = "Diana";
                break;
            case 63:
                id = "Brand";
                break;
            case 113:
                id = "Sejuani";
                break;
            case 8:
                id = "Vladimir";
                break;
            case 154:
                id = "Zac";
                break;
            case 421:
                id = "RekSai";
                break;
            case 133:
                id = "Quinn";
                break;
            case 84:
                id = "Akali";
                break;
            case 163:
                id = "Taliyah";
                break;
            case 18:
                id = "Tristana";
                break;
            case 120:
                id = "Hecarim";
                break;
            case 15:
                id = "Sivir";
                break;
            case 236:
                id = "Lucian";
                break;
            case 107:
                id = "Rengar";
                break;
            case 19:
                id = "Warwick";
                break;
            case 72:
                id = "Skarner";
                break;
            case 54:
                id = "Malphite";
                break;
            case 157:
                id = "Yasuo";
                break;
            case 101:
                id = "Xerath";
                break;
            case 17:
                id = "Teemo";
                break;
            case 75:
                id = "Nasus";
                break;
            case 58:
                id = "Renekton";
                break;
            case 119:
                id = "Draven";
                break;
            case 35:
                id = "Shaco";
                break;
            case 50:
                id = "Swain";
                break;
            case 91:
                id = "Talon";
                break;
            case 40:
                id = "Janna";
                break;
            case 115:
                id = "Ziggs";
                break;
            case 245:
                id = "Ekko";
                break;
            case 61:
                id = "Orianna";
                break;
            case 114:
                id = "Fiora";
                break;
            case 9:
                id = "Fiddlesticks";
                break;
            case 31:
                id = "Chogath";
                break;
            case 33:
                id = "Rammus";
                break;
            case 7:
                id = "Leblanc";
                break;
            case 16:
                id = "Soraka";
                break;
            case 26:
                id = "Zilean";
                break;
            case 56:
                id = "Nocturne";
                break;
            case 222:
                id = "Jinx";
                break;
            case 83:
                id = "Yorick";
                break;
            case 6:
                id = "Urgot";
                break;
            case 203:
                id = "Kindred";
                break;
            case 21:
                id = "MissFortune";
                break;
            case 62:
                id = "MonkeyKing";
                break;
            case 53:
                id = "Blitzcrank";
                break;
            case 98:
                id = "Shen";
                break;
            case 201:
                id = "Braum";
                break;
            case 5:
                id = "XinZhao";
                break;
            case 29:
                id = "Twitch";
                break;
            case 11:
                id = "MasterYi";
                break;
            case 44:
                id = "Taric";
                break;
            case 32:
                id = "Amumu";
                break;
            case 41:
                id = "Gangplank";
                break;
            case 48:
                id = "Trundle";
                break;
            case 38:
                id = "Kassadin";
                break;
            case 161:
                id = "Velkoz";
                break;
            case 143:
                id = "Zyra";
                break;
            case 267:
                id = "Nami";
                break;
            case 59:
                id = "JarvanIV";
                break;
            case 81:
                id = "Ezreal";
                break;
            case 350:
                id = "Yuumi";
                break;
            case 145:
                id = "Kaisa";
                break;
            case 518:
                id = "Neeko";
                break;
            case 142:
                id = "Zoe";
                break;
            case 498:
                id = "Xayah";
                break;
            case 517:
                id = "Sylas";
                break;
            case 141:
                id = "Kayn";
                break;
            case 516:
                id = "Ornn";
                break;
            case 555:
                id = "Pyke";
                break;
            case 164:
                id = "Camille";
                break;
            case 246:
                id = "Qiyana";
                break;
            case 497:
                id = "Rakan";
                break;
            case 777:
                id = "Yone";
                break;
            case 876:
                id = "Lillia";
                break;
            case 235:
                id = "Senna";
                break;
            case 875:
                id = "Sett";
                break;
            case 523:
                id = "Aphelios";
                break;

            case 223:
                id = "TahmKench";
                break;

            case 360:
                id = "Samira";
                break;

            case 166:
                id = "Akshan";
                break;

            case 526:
                id = "Rell";
                break;

            case 234:
                id = "Viego";
                break;

            case 887:
                id = "Gwen";
                break;
        }


        return id;
    }

    public static String changeEnglishToKoreanName(int ChampCode) { // ????????????: ????????? id
        String $a = null;
        switch (ChampCode) {
            case 266:
                $a = "????????????";
                break; // ????????? ?????? ??????
            case 412:
                $a = "?????????";
                break;
            case 23:
                $a = "???????????????";
                break;
            case 79:
                $a = "????????????";
                break;
            case 69:
                $a = "???????????????";
                break;
            case 136:
                $a = "??????????????? ???";
                break;
            case 13:
                $a = "?????????";
                break;
            case 78:
                $a = "??????";
                break;
            case 14:
                $a = "?????????";
                break;
            case 1:
                $a = "??????";
                break;
            case 202:
                $a = "???";
                break;
            case 43:
                $a = "?????????";
                break;
            case 111:
                $a = "????????????";
                break;
            case 240:
                $a = "?????????";
                break;
            case 99:
                $a = "??????";
                break;
            case 103:
                $a = "??????";
                break;
            case 2:
                $a = "?????????";
                break;
            case 112:
                $a = "?????????";
                break;
            case 34:
                $a = "????????????";
                break;
            case 27:
                $a = "?????????";
                break;
            case 86:
                $a = "??????";
                break;
            case 127:
                $a = "????????????";
                break;
            case 57:
                $a = "????????????";
                break;
            case 25:
                $a = "????????????";
                break;
            case 28:
                $a = "?????????";
                break;
            case 105:
                $a = "??????";
                break;
            case 74:
                $a = "???????????????";
                break;
            case 238:
                $a = "??????";
                break;
            case 68:
                $a = "??????";
                break;
            case 82:
                $a = "???????????????";
                break;
            case 37:
                $a = "??????";
                break;
            case 96:
                $a = "?????????";
                break;
            case 55:
                $a = "????????????";
                break;
            case 117:
                $a = "??????";
                break;
            case 22:
                $a = "??????";
                break;
            case 30:
                $a = "?????????";
                break;
            case 12:
                $a = "????????????";
                break;
            case 122:
                $a = "????????????";
                break;
            case 67:
                $a = "??????";
                break;
            case 110:
                $a = "?????????";
                break;
            case 77:
                $a = "?????????";
                break;
            case 89:
                $a = "?????????";
                break;
            case 126:
                $a = "?????????";
                break;
            case 134:
                $a = "?????????";
                break;
            case 80:
                $a = "?????????";
                break;
            case 92:
                $a = "??????";
                break;
            case 121:
                $a = "?????????";
                break;
            case 42:
                $a = "?????????";
                break;
            case 268:
                $a = "?????????";
                break;
            case 51:
                $a = "????????????";
                break;
            case 76:
                $a = "?????????";
                break;
            case 85:
                $a = "??????";
                break;
            case 3:
                $a = "?????????";
                break;
            case 45:
                $a = "?????????";
                break;
            case 432:
                $a = "??????";
                break;
            case 150:
                $a = "??????";
                break;
            case 90:
                $a = "?????????";
                break;
            case 104:
                $a = "???????????????";
                break;
            case 254:
                $a = "??????";
                break;
            case 10:
                $a = "??????";
                break;
            case 39:
                $a = "????????????";
                break;
            case 64:
                $a = "??? ???";
                break;
            case 420:
                $a = "????????????";
                break;
            case 60:
                $a = "?????????";
                break;
            case 106:
                $a = "????????????";
                break;
            case 20:
                $a = "??????";
                break;
            case 4:
                $a = "??????????????? ?????????";
                break;
            case 24:
                $a = "??????";
                break;
            case 102:
                $a = "?????????";
                break;
            case 429:
                $a = "????????????";
                break;
            case 36:
                $a = "?????? ??????";
                break;
            case 427:
                $a = "?????????";
                break;
            case 131:
                $a = "????????????";
                break;
            case 63:
                $a = "?????????";
                break;
            case 113:
                $a = "????????????";
                break;
            case 8:
                $a = "???????????????";
                break;
            case 154:
                $a = "??????";
                break;
            case 421:
                $a = "?????????";
                break;
            case 133:
                $a = "???";
                break;
            case 84:
                $a = "?????????";
                break;
            case 163:
                $a = "?????????";
                break;
            case 18:
                $a = "???????????????";
                break;
            case 120:
                $a = "?????????";
                break;
            case 15:
                $a = "?????????";
                break;
            case 236:
                $a = "?????????";
                break;
            case 107:
                $a = "??????";
                break;
            case 19:
                $a = "??????";
                break;
            case 72:
                $a = "?????????";
                break;
            case 54:
                $a = "????????????";
                break;
            case 157:
                $a = "?????????";
                break;
            case 101:
                $a = "?????????";
                break;
            case 17:
                $a = "??????";
                break;
            case 75:
                $a = "?????????";
                break;
            case 58:
                $a = "?????????";
                break;
            case 119:
                $a = "????????????";
                break;
            case 35:
                $a = "??????";
                break;
            case 50:
                $a = "?????????";
                break;
            case 91:
                $a = "??????";
                break;
            case 40:
                $a = "??????";
                break;
            case 115:
                $a = "??????";
                break;
            case 245:
                $a = "??????";
                break;
            case 61:
                $a = "????????????";
                break;
            case 114:
                $a = "?????????";
                break;
            case 9:
                $a = "????????????";
                break;
            case 31:
                $a = "?????????";
                break;
            case 33:
                $a = "?????????";
                break;
            case 7:
                $a = "?????????";
                break;
            case 16:
                $a = "?????????";
                break;
            case 26:
                $a = "?????????";
                break;
            case 56:
                $a = "??????";
                break;
            case 222:
                $a = "?????????";
                break;
            case 83:
                $a = "??????";
                break;
            case 6:
                $a = "?????????";
                break;
            case 203:
                $a = "????????????";
                break;
            case 21:
                $a = "?????? ??????";
                break;
            case 62:
                $a = "??????";
                break;
            case 53:
                $a = "??????????????????";
                break;
            case 98:
                $a = "???";
                break;
            case 201:
                $a = "?????????";
                break;
            case 5:
                $a = "??? ??????";
                break;
            case 29:
                $a = "?????????";
                break;
            case 11:
                $a = "????????? ???";
                break;
            case 44:
                $a = "??????";
                break;
            case 32:
                $a = "?????????";
                break;
            case 41:
                $a = "?????????";
                break;
            case 48:
                $a = "?????????";
                break;
            case 38:
                $a = "?????????";
                break;
            case 161:
                $a = "?????????";
                break;
            case 143:
                $a = "?????????";
                break;
            case 267:
                $a = "??????";
                break;
            case 59:
                $a = "????????? 4???";
                break;
            case 81:
                $a = "????????????";
                break;
            case 350:
                $a = "??????";
                break;
            case 145:
                $a = "?????????";
                break;
            case 518:
                $a = "??????";
                break;
            case 142:
                $a = "??????";
                break;
            case 498:
                $a = "??????";
                break;
            case 517:
                $a = "????????????";
                break;
            case 141:
                $a = "??????";
                break;
            case 516:
                $a = "??????";
                break;
            case 555:
                $a = "?????????";
                break;
            case 164:
                $a = "??????";
                break;
            case 246:
                $a = "?????????";
                break;
            case 497:
                $a = "??????";
                break;
            case 777:
                $a = "??????";
                break;
            case 876:
                $a = "?????????";
                break;
            case 235:
                $a = "??????";
                break;
            case 875:
                $a = "??????";
                break;
            case 523:
                $a = "???????????????";
                break;

            case 223:
                $a = "??? ??????";
                break;

            case 360:
                $a = "?????????";
                break;

            case 166:
                $a = "?????????";
                break;

            case 526:
                $a = "???";
                break;

            case 234:
                $a = "?????????";
                break;

            case 887:
                $a = "??????";
                break;


        }


        return $a;
    }

    public static String changeTierToKoreanAndSetImg(String tier, ImageView view) {

        switch (tier) {
            case "IRON":
                tier = "?????????";
                view.setImageResource(R.drawable.emblem_iron);
                break;
            case "BRONZE":
                tier = "?????????";
                view.setImageResource(R.drawable.emblem_bronze);
                break;
            case "SILVER":
                tier = "??????";
                view.setImageResource(R.drawable.emblem_silver);
                break;
            case "GOLD":
                tier = "??????";
                view.setImageResource(R.drawable.emblem_gold);
                break;
            case "PLATINUM":
                tier = "????????????";
                view.setImageResource(R.drawable.emblem_platinum);
                break;
            case "DIAMOND":
                tier = "???????????????";
                view.setImageResource(R.drawable.emblem_diamond);
                break;
            case "MASTER":
                tier = "?????????";
                view.setImageResource(R.drawable.emblem_master);
                break;
            case "GRANDMASTER":
                tier = "??????????????????";
                view.setImageResource(R.drawable.emblem_grandmaster);
                break;
            case "CHALLENGER":
                tier = "?????????";
                view.setImageResource(R.drawable.emblem_challenger);
                break;
        }
        return tier;
    }

    public static void SetSpellImg(long spell, ImageView view) {

        switch ((int) spell) {
            case 21:
                view.setImageResource(R.drawable.summonerbarrier);
                break;
            case 1:
                view.setImageResource(R.drawable.summonerboost);
                break;
            case 14:
                view.setImageResource(R.drawable.summonerdot);
                break;
            case 3:
                view.setImageResource(R.drawable.summonerexhaust);
                break;
            case 4:
                view.setImageResource(R.drawable.summonerflash);
                break;
            case 6:
                view.setImageResource(R.drawable.summonerhaste);
                break;
            case 7:
                view.setImageResource(R.drawable.summonerheal);
                break;
            case 13:
                view.setImageResource(R.drawable.summonermana);
                break;
            case 20:
                view.setImageResource(R.drawable.summonersnowurfsnowball_mark);
                break;
            case 11:
                view.setImageResource(R.drawable.summonersmite);
                break;
            case 12:
                view.setImageResource(R.drawable.summonerteleport);
                break;
        }
    }

    public static void SetRuneImg(long rune, ImageView view) {

        switch ((int) rune) {
            case 8100:
                view.setImageResource(R.drawable.domination_7200);
                break;
            case 8000:
                view.setImageResource(R.drawable.precision_7201);
                break;
            case 8200:
                view.setImageResource(R.drawable.sorcery_7202);
                break;
            case 8300:
                view.setImageResource(R.drawable.whimsy_7203);
                break;
            case 8400:
                view.setImageResource(R.drawable.resolve_7204);
                break;

        }
    }
}
