package com.example.assignment5.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    private static ArrayList<String> mNames = new ArrayList<>();
    private static ArrayList<String> mDescription = new ArrayList<>();
    private static ArrayList<String> mDetailedDescription = new ArrayList<>();
    private static ArrayList<String> mImageUrls = new ArrayList<>();



    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 5;


    static {

        mImageUrls.add("https://en.wikipedia.org/wiki/Association_football#/media/File:Football_iu_1996.jpg");
        mNames.add("Soccer");
        mDescription.add("A game that is called a religion unto itself");
        mDetailedDescription.add("Soccer is a team sport played with a spherical ball between two teams " +
                "of 11 players. It is played by approximately 250 million players in over 200 count" +
                "ries and dependencies, making it the world's most popular sport. The game is playe" +
                "d on a rectangular field called a pitch with a goal at each end. The object of the" +
                " game is to outscore the opposition by moving the ball beyond the goal line into t" +
                "he opposing goal. The team with the higher number of goals wins the game.");


        mImageUrls.add("https://en.wikipedia.org/wiki/Tennis#/media/File:Roger_Federer_2012_Indian_Wells.jpg");
        mNames.add("Tennis");
        mDescription.add("A racket-ball game that is considered to be elegant.");
        mDetailedDescription.add("Tennis is a racket sport that can be played individually against" +
                " a single opponent (singles) or between two teams of two players each (doubles). E" +
                "ach player uses a tennis racket that is strung with cord to strike a hollow rubber" +
                " ball covered with felt over or around a net and into the opponent's court. The ob" +
                "ject of the game is to maneuver the ball in such a way that the opponent is not abl" +
                "e to play a valid return. The player who is unable to return the ball will not gain " +
                "a point, while the opposite player will.");

        mImageUrls.add("https://en.wikipedia.org/wiki/Chess#/media/File:ChessSet.jpg2");
        mNames.add("Chess");
        mDescription.add("The smartest game");
        mDetailedDescription.add("Chess is a two-player strategy board game played on a checkered " +
                "board with 64 squares arranged in an 8×8 square grid. Played by millions of people" +
                " worldwide, chess is believed to be derived from the Indian game chaturanga sometim" +
                "e before the 7th century. Chaturanga is also the likely ancestor of the East Asian s" +
                "trategy games xiangqi (Chinese chess), janggi (Korean chess), and shogi (Japanese ch" +
                "ess). Chess reached Europe via Persia and Arabia by the 9th century, due to the Umay" +
                "yad conquest of Hispania. The queen and bishop assumed their current powers in Spain " +
                "in the late 15th century, and the modern rules were standardized in the 19th century.");

        mImageUrls.add("https://en.wikipedia.org/wiki/Cricket#/media/File:Eden_Gardens_under_floodlights_during_a_match.jpg");
        mNames.add("Cricket");
        mDescription.add("A bat-ball game dominated by India, Australia and England");
        mDetailedDescription.add("Cricket is a bat-and-ball game played between two teams of eleven " +
                "players on a field at the centre of which is a 22-yard (20-metre) pitch with a wic" +
                "ket " +
                "at each end, each comprising two bails balanced on three stumps. The batting side s" +
                "cores " +
                "runs by striking the ball bowled at the wicket with the bat (and running between the" +
                " wickets)," +
                " while the bowling and fielding side tries to prevent this (by preventing the bal" +
                "l from leaving th" +
                "e field, and getting the ball to either wicket) and dismiss each batter (so they a" +
                "re \"out\"). Means of " +
                "dismissal include being bowled, when the ball hits the stumps and dislodges the ba" +
                "ils, and by the fieldi" +
                "ng side either catching the ball after it is hit by the bat, but before it hits th" +
                "e ground, or hitti" +
                "ng a wicket with the ball before a batter can cross the crease in front of the wic" +
                "ket. When ten batter" +
                "s have been dismissed, the innings ends and the teams swap roles. ");


        mImageUrls.add("https://en.wikipedia.org/wiki/Golf#/media/File:Golfer_swing.jpg");
        mNames.add("Golf");
        mDescription.add("A leisure game of the gentlemen");
        mDetailedDescription.add("Golf is a club-and-ball sport in which players use various clubs to hit balls into a series of holes on a course in as few strokes as possible.\n" +
                "\n" +
                "Golf, unlike most ball games, cannot and does not utilize a standardized playing area, and coping with the varied terrains encountered on different courses is a key part of the game. The game at the usual level is played on a course with an arranged progression of 18 holes, though recreational courses can be smaller, often having nine holes. Each hole on the course must contain a teeing ground to start from, and a putting green containing the actual hole or cup 4 1⁄4 inches (11 cm) in diameter. There are other standard forms of terrain in between, such as the fairway, rough (long grass), bunkers (or \"sand traps\"), and various hazards (water, rocks) but each hole on a course is unique in its specific layout and arrangement.\n" +
                "\n" +
                "Golf is played for the lowest number of strokes by an individual, known as stroke play, or the lowest score on the most individual holes in a complete round by an individual or team, known as match play. Stroke play is the most commonly seen format at all levels, but most especially at the elite level.");

        mImageUrls.add("https://en.wikipedia.org/wiki/Polo#/media/File:Varsity_Polo_2013.jpg");
        mNames.add("Polo");
        mDescription.add("Hockey on horses");
        mDetailedDescription.add("Polo is an Iranian horseback mounted team sport. It is one of the world's oldest known team sports.[3]\n" +
                "\n" +
                "The concept of the game and its variants date back from the 6th century BC to the 1st century AD. The sport originated from equestrian games played by nomadic Iranian peoples .[4] Polo was at first a training game for cavalry units, usually the Persian king’s guard or other elite troops.[5] A notable example is Saladin, who was known for being a skilled polo player which contributed to his cavalry training.[6][7] It is now popular around the world, with well over 100 member countries in the Federation of International Polo. It is played professionally in 16 countries. It was an Olympic sport from 1900 to 1936.");

        // Add some sample items.
        for (int i = 0; i <= COUNT; i++) {
            addItem(new DummyItem(String.valueOf(i), mNames.get(i), mDescription.get(i), mDetailedDescription.get(i), mImageUrls.get(i)));
        }


    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), mNames.get(position), mDescription.get(position), mDetailedDescription.get(position), mImageUrls.get(position));
    }
    /*

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }
     */

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;
        public final String description;
        public final String imageUrl;

        public DummyItem(String id, String content, String details, String description, String imageUrl) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.description = description;
            this.imageUrl = imageUrl;
        }

        @Override
        public String toString() {
            return content;
        }
    }

    public void initImageBitmaps(){
        mImageUrls.add("https://en.wikipedia.org/wiki/Association_football#/media/File:Football_iu_1996.jpg");
        mNames.add("Soccer");
        mDescription.add("A game that is called a religion unto itself");
        mDetailedDescription.add("Soccer is a team sport played with a spherical ball between two teams " +
                "of 11 players. It is played by approximately 250 million players in over 200 count" +
                "ries and dependencies, making it the world's most popular sport. The game is playe" +
                "d on a rectangular field called a pitch with a goal at each end. The object of the" +
                " game is to outscore the opposition by moving the ball beyond the goal line into t" +
                "he opposing goal. The team with the higher number of goals wins the game.");


        mImageUrls.add("https://en.wikipedia.org/wiki/Tennis#/media/File:Roger_Federer_2012_Indian_Wells.jpg");
        mNames.add("Tennis");
        mDescription.add("A racket-ball game that is considered to be elegant.");
        mDetailedDescription.add("Tennis is a racket sport that can be played individually against" +
                " a single opponent (singles) or between two teams of two players each (doubles). E" +
                "ach player uses a tennis racket that is strung with cord to strike a hollow rubber" +
                " ball covered with felt over or around a net and into the opponent's court. The ob" +
                "ject of the game is to maneuver the ball in such a way that the opponent is not abl" +
                "e to play a valid return. The player who is unable to return the ball will not gain " +
                "a point, while the opposite player will.");

        mImageUrls.add("https://en.wikipedia.org/wiki/Chess#/media/File:ChessSet.jpg2");
        mNames.add("Chess");
        mDescription.add("The smartest game");
        mDetailedDescription.add("Chess is a two-player strategy board game played on a checkered " +
                "board with 64 squares arranged in an 8×8 square grid. Played by millions of people" +
                " worldwide, chess is believed to be derived from the Indian game chaturanga sometim" +
                "e before the 7th century. Chaturanga is also the likely ancestor of the East Asian s" +
                "trategy games xiangqi (Chinese chess), janggi (Korean chess), and shogi (Japanese ch" +
                "ess). Chess reached Europe via Persia and Arabia by the 9th century, due to the Umay" +
                "yad conquest of Hispania. The queen and bishop assumed their current powers in Spain " +
                "in the late 15th century, and the modern rules were standardized in the 19th century.");

        mImageUrls.add("https://en.wikipedia.org/wiki/Cricket#/media/File:Eden_Gardens_under_floodlights_during_a_match.jpg");
        mNames.add("Cricket");
        mDescription.add("A bat-ball game dominated by India, Australia and England");
        mDetailedDescription.add("Cricket is a bat-and-ball game played between two teams of eleven " +
                "players on a field at the centre of which is a 22-yard (20-metre) pitch with a wic" +
                "ket " +
                "at each end, each comprising two bails balanced on three stumps. The batting side s" +
                "cores " +
                "runs by striking the ball bowled at the wicket with the bat (and running between the" +
                " wickets)," +
                " while the bowling and fielding side tries to prevent this (by preventing the bal" +
                "l from leaving th" +
                "e field, and getting the ball to either wicket) and dismiss each batter (so they a" +
                "re \"out\"). Means of " +
                "dismissal include being bowled, when the ball hits the stumps and dislodges the ba" +
                "ils, and by the fieldi" +
                "ng side either catching the ball after it is hit by the bat, but before it hits th" +
                "e ground, or hitti" +
                "ng a wicket with the ball before a batter can cross the crease in front of the wic" +
                "ket. When ten batter" +
                "s have been dismissed, the innings ends and the teams swap roles. ");


        mImageUrls.add("https://en.wikipedia.org/wiki/Golf#/media/File:Golfer_swing.jpg");
        mNames.add("Golf");
        mDescription.add("A leisure game of the gentlemen");
        mDetailedDescription.add("Golf is a club-and-ball sport in which players use various clubs to hit balls into a series of holes on a course in as few strokes as possible.\n" +
                "\n" +
                "Golf, unlike most ball games, cannot and does not utilize a standardized playing area, and coping with the varied terrains encountered on different courses is a key part of the game. The game at the usual level is played on a course with an arranged progression of 18 holes, though recreational courses can be smaller, often having nine holes. Each hole on the course must contain a teeing ground to start from, and a putting green containing the actual hole or cup 4 1⁄4 inches (11 cm) in diameter. There are other standard forms of terrain in between, such as the fairway, rough (long grass), bunkers (or \"sand traps\"), and various hazards (water, rocks) but each hole on a course is unique in its specific layout and arrangement.\n" +
                "\n" +
                "Golf is played for the lowest number of strokes by an individual, known as stroke play, or the lowest score on the most individual holes in a complete round by an individual or team, known as match play. Stroke play is the most commonly seen format at all levels, but most especially at the elite level.");

        mImageUrls.add("https://en.wikipedia.org/wiki/Polo#/media/File:Varsity_Polo_2013.jpg");
        mNames.add("Polo");
        mDescription.add("Hockey on horses");
        mDetailedDescription.add("Polo is an Iranian horseback mounted team sport. It is one of the world's oldest known team sports.[3]\n" +
                "\n" +
                "The concept of the game and its variants date back from the 6th century BC to the 1st century AD. The sport originated from equestrian games played by nomadic Iranian peoples .[4] Polo was at first a training game for cavalry units, usually the Persian king’s guard or other elite troops.[5] A notable example is Saladin, who was known for being a skilled polo player which contributed to his cavalry training.[6][7] It is now popular around the world, with well over 100 member countries in the Federation of International Polo. It is played professionally in 16 countries. It was an Olympic sport from 1900 to 1936.");

    }
}