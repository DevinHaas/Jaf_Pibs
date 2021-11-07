package jaf.kapitel6.pp610;

public class PP610 {
  public static void main(String[] args) {

    //creat strings for the Song lines (verse) and for the suffix (day)
    String verse;
    //String builder instead normal String because of Sonarlint
    StringBuilder totalVerses = new StringBuilder();
    String day;

    String firstPart = "On the ";
    String secondPart = " day of Christmas, my true love gave to me";

    int counter = 1;

    //creat a for loop that creates the 12 verses of the song
    for (int i = 1; i <= 12; i++) {

      //creat one switch statement for appending the current verses
      switch (counter) {
        case 12:
          verse = "Twelve pipers piping,\n";
          totalVerses.append(verse);
          // fall-trough intended
        case 11:
          verse = "Eleven pipers piping,\n";
          totalVerses.append(verse);
          // fall-trough intended
        case 10:
          verse = "Ten lords a-leaping,\n";
          totalVerses.append(verse);
          // fall-trough intended
        case 9:
          verse = "Nine ladies dancing,\n";
          totalVerses.append(verse);
          // fall-trough intended
        case 8:
          verse = "Eight maids a-milking,\n";
          totalVerses.append(verse);
          // fall-trough intended
        case 7:
          verse = "Seven swans a-swimming,\n";
          totalVerses.append(verse);
          // fall-trough intended
        case 6:
          verse = "Six geese a-laying,\n";
          totalVerses.append(verse);
          // fall-trough intended
        case 5:
          verse = "Five golden rings,\n";
          totalVerses.append(verse);
          // fall-trough intended
        case 4:
          verse = "Four calling birds,\n";
          totalVerses.append(verse);
          // fall-trough intended
        case 3:
          verse = "Three French hens,\n";
          totalVerses.append(verse);
          // fall-trough intended
        case 2:
          verse = "Two turtle doves, and\n";
          totalVerses.append(verse);
          // fall-trough intended
        case 1:
          verse = "A partridge in a pear tree\n";
          totalVerses.append(verse);
          break;
        default:System.out.println("The record player is broken!!");
      }
      //creat another switch statement for the suffixes and for printing the verses
      //and most important incrementing the counter
      switch (counter) {
        case 1 -> {
          day = "1st";
          System.out.println(firstPart + day + secondPart);
          System.out.println(totalVerses);
          totalVerses.setLength(0);
          counter++;
        }
        case 2 -> {
          day = "2nd";
          System.out.println(firstPart + day + secondPart);
          System.out.println(totalVerses);
          totalVerses.setLength(0);
          counter++;
        }
        case 3 -> {
          day = "3rd";
          System.out.println(firstPart + day + secondPart);
          System.out.println(totalVerses);
          totalVerses.setLength(0);
          counter++;
        }
        case 4 -> {
          day = "4th";
          System.out.println(firstPart + day + secondPart);
          System.out.println(totalVerses);
          totalVerses.setLength(0);
          counter++;
        }
        case 5 -> {
          day = "5th";
          System.out.println(firstPart + day + secondPart);
          System.out.println(totalVerses);
          totalVerses.setLength(0);
          counter++;
        }
        case 6 -> {
          day = "6th";
          System.out.println(firstPart + day + secondPart);
          System.out.println(totalVerses);
          totalVerses.setLength(0);
          counter++;
        }
        case 7 -> {
          day = "7th";
          System.out.println(firstPart + day + secondPart);
          System.out.println(totalVerses);
          totalVerses.setLength(0);
          counter++;
        }
        case 8 -> {
          day = "8th";
          System.out.println(firstPart + day + secondPart);
          System.out.println(totalVerses);
          totalVerses.setLength(0);
          counter++;
        }
        case 9 -> {
          day = "9th";
          System.out.println(firstPart + day + secondPart);
          System.out.println(totalVerses);
          totalVerses.setLength(0);
          counter++;
        }
        case 10 -> {
          day = "10th";
          System.out.println(firstPart + day + secondPart);
          System.out.println(totalVerses);
          totalVerses.setLength(0);
          counter++;
        }
        case 11 -> {
          day = "11th";
          System.out.println(firstPart + day + secondPart);
          System.out.println(totalVerses);
          totalVerses.setLength(0);
          counter++;
        }
        case 12 -> {
          day = "12th";
          System.out.println(firstPart + day + secondPart);
          System.out.println(totalVerses);
          totalVerses.setLength(0);
          counter++;
        }
        default -> System.out.println("The record player is broken!!");
      }

    }
  }
}
