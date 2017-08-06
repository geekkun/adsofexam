/*
Question A7 to A12, and some questions in part B, make use of a Java class Team
representing a sports team, which has the following public constructor:
Team(String name, ArrayList<Player> players, Manager man)
creates a new Team object, with initial name name, associated Player objects
from players , and associated Manager object man
and the following public methods:
String getName() returns the name of the team
Manager getManager() returns the representation of the manager of the team
ArrayList<Player> getPlayers() returns a list representing the players of the team
int play(Team team) represents playing a match with another team given by the
argument to the method. The object the method is called on represents the “home team”
and the object that is its argument represents the “away team”. The method call returns a
positive integer if the match is won by the home team, a negative integer if the match is
won by the away team, and 0 if the match results in a draw.

Class Player has the following public methods:
String getName() returns the name of the player
int getAge() returns the age of the player

Question A7
Write a static method called findOldest that takes an argument of type
ArrayList<Team> and returns the name of the oldest player from all of the players of
the teams in the list of Team objects. If there are two or more players with the same
age and no player with a higher age, it should return the name of one of them, which
one does not matter.
*/


static String findOldest(ArrayList<Team> team){
  String name = "";
  int age = 0;

  for(int i = 0; i<team.size(); i++){
    ArrayList<Player> player = team.getPlayers();

    for(int j = 0; j<player.size(); j++){
      if (player.get(j).getAge() > age){
        age = player.get(j).getAge();
        name =  player.get(j).getName();
      }
    }
  }
}

/*
Question A8
Write a class called LeagueTeam that is a subclass of Team. The class LeagueTeam
should work just like Team, except that it keeps a count of points scored every time a
match is played with another team represented by a LeagueTeam. When a team wins
a match, its count is increased by 3, when a team has a draw, its count is increased by
1, its count remains the same if it loses a match. This applies to both the home team
and the away team of the match. In any match, if the home team wins then the away
team loses and vice versa, if the home team has a draw so does the away team.

The following additional public methods should be provided in LeagueTeam:
int getPoints() returns the current number of points the team has
void resetPoints() resets the number of points the team has to 0
*/

class LeagueTeam extends Team{
  private int points;

  public int getPoints(){
    return points;
  }

  public void resetPoints(){

  }

  private int play(Team team) {
   int result=super.play(team);
   if(team instanceof LeagueTeam)
      {
       LeagueTeam lteam = (LeagueTeam) team;
       if(result>0)
          points+=3;
       else if(result==0)
          {
           points+=1;
           lteam.points+=1;
          }
       else
          lteam.points+=3;
      }
   return result;
  }

}

/*
Write a static method called listManagers which takes an ArrayList<Team> and
returns an ArrayList<Manager> where for each position i in the ArrayList<Team>
the representation of the manager of the team at that position is in position i of the
ArrayList<Manager>. Write your method so that it would also work if it were given an
ArrayList<LeagueTeam> argument, with LeagueTeam as described in question A8.
*/

static ArrayList<Manager> listManagers(ArrayList<Team>){

}

/*
Write a class called TeamMaker which uses the factory object design pattern to
produce Team objects.
The way it should work is that a TeamMaker object holds a collection of Player
objects representing potential team members. This collection is initialised by the
constructor for TeamMaker, so the constructor must have a parameter of type
Set<Player>.

Then when a new team is to be created, a factory method is called that gives the name
of the team, the number of players it has, and its manager. The required number of
players is then taken from the set of players to form the team. It does not matter what
players are taken, but once a player is taken it must be removed from the set of
potential players. You can assume there will always be enough potential players.
There must also be methods to enable players to be added or removed from the set of
potential team members.

So TeamMaker must be provided with the following public methods:
Team makeTeam(String name, int teamsize, Manager man)
void addPlayer(Player p)
void removePlayer(Player p)
*/

class TeamMaker {
  public Team makeTeam(String name, int teamsize, Manager man){

  }
  public void addPlayer(Player p){

  }
  public void removePlayer(Player p){

  }
}

/*
Write a modified version of the method makeTeam for TeamMaker as given for question
A10 that deals with the possibility of there not being enough potential players to form a
team by throwing a checked exception of type NotEnoughPlayersException in that
case. The constructor for NotEnoughPlayersException should take as its
argument the extra number of players that would be needed. Also write a class that
provides NotEnoughPlayersException by extending Java’s class Exception.
*/

/*

*/
