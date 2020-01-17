import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class User implements Serializable {

	
	private String name;
	private long id;
	private Date joinDate;
	private int age;
	public transient int SSN = 11122333;
	
	private static int userCount;
	private static long nextID;
	
	
	public User() {
		age = 18;
		name = "John Doe";
		id = nextID;
		joinDate = new Date();
		
		userCount++;
		nextID++;
	}
	
	public User(int age, String name) {
		this.age = age;
		this.name = name;
		id = nextID;
		joinDate = new Date();
		
		userCount++;
		nextID++;
	}
	
	public User(User u) {
		this.age = u.age;
		this.name = u.name;
		
		joinDate = new Date();
		id = nextID;
		
		userCount++;
		nextID++;
	}


	public User copyUser() {
		return new User(this);
	}
	
	
	
	public String toString() {
		return "Name: " + name + "\nID: " + id + "\nJoin Date: " + joinDate + "\nAge: "+age;
	}
	
	
	public void age() {
		age++;
	}
	
	public String getLifetime() {
		String out;
		Date cur = new Date();
		Date diff = new Date(cur.getTime() - joinDate.getTime());
		long uptime = diff.getTime();
		
		long days = TimeUnit.MILLISECONDS.toDays(uptime);
		uptime -= TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS
	    .toHours(uptime);
		uptime -= TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(uptime);
		uptime -= TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(uptime);
		
		out = days + "d " + hours + "h " + minutes + "m " + seconds + "s";
		return out;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getUserCount() {
		return userCount;
	}

	public static void setUserCount(int userCount) {
		User.userCount = userCount;
	}

	public static long getNextID() {
		return nextID;
	}

	public static void setNextID(long nextID) {
		User.nextID = nextID;
	}
	
	
}
