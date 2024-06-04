/*
*CallCenter.java
*@author D.Ho
*8/5/24
*/

public class CallCenter{
	//declare data types
	private String name;
	private String num;
	private String loc;
	private String msg;
	private boolean pro;

	//constructor - default values
	public CallCenter(){
		name = new String();
		num = new String();
		loc = new String();
		msg = new String();
		pro = true;
	}

	//setters - one for every input
	public void setName(String name){
		this.name = name;
	}

	public void setNum(String num){
		this.num = num;
	}

	public void setLoc(String loc){
		this.loc = loc;
	}


	//compute - processing
	public void compute(){
		if(loc.equalsIgnoreCase("Dublin") && num.length() == 7 && num.charAt(0) == '1' && num.charAt(1) == '2'&& num.charAt(2) =='3'){
			pro = true;
			msg = "Your call will be processed shortly!";
			for(int i = 0; i < num.length();i++){
				if(num.charAt(i) == '!' || num.charAt(i) == '@' || num.charAt(i) == '$'){
					msg = "Congrats, You won 20 euro!";
				}
				else if(num.charAt(i) != '!' || num.charAt(i) != '@' || num.charAt(i) != '$'){
					msg = "You didn't win any promo but your call will be processed!";
				}
			}
		}
		else{
			msg = "Invalid, your call will not be processed";
		}
	}


	//getter - one for every output
	public String getMsg(){
		return msg;
	}

	public boolean getPro(){
		return pro;
	}
}