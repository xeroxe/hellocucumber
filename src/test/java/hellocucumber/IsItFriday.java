package hellocucumber;

class IsItFriday {
    static String isItFriday(String today) {
        if(today == "Friday") {
            return "Yes";
        }
        else {
            return "Nope";
        }
    }
}
