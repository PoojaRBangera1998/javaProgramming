import java.util.*;
class Channel
{
	String cname;
	double cprice;

	Channel(String cname,double cprice)
	{
		this.cname=cname;
		this.cprice=cprice;
	}
}


class RegionalPack
{
	String rname;
	double rprice;
	

	RegionalPack(String rname,double rprice)
	{
		this.rname=rname;
		this.rprice=rprice;
		
	}
}


class TataSky
{
	String tname="Anvith Kateel";
	long contact_no=7022111740l;
	String DOB="09-01-1998";
	String gender="Male";
	String email_id="anvithkateel01@gmail.com";

	HashSet channel=new HashSet();
	HashSet regionalpack=new HashSet();

	public void modifyPack()
	{
		Scanner s=new Scanner(System.in);
		Boolean flag=true;
		do
		{
			System.out.println("select the option ");
        		System.out.println("1.Addchannel");
			System.out.println("2.AddRegionalPack");
			System.out.println("3.RemoveChannel");
			System.out.println("4.RemoveRegionalPack");
	    		System.out.println("5.exit");
			int a1=s.nextInt();

		switch (a1)
		{
			case 1 :
			     	System.out.println("please select the channel required");
		         	System.out.println("1.Sports Star");
				 System.out.println("2.Geo");
				 int cha=s.nextInt();

				 switch (cha)
				 {
				 case 1 :  channel.add(new Channel("Sports Star",50.0));
				           System.out.println("Sports Star has been successfully added");
						   break;
                 		case 2 :  channel.add(new Channel("Geo",140.0));
				           System.out.println("Geo channel has been successfully added");
						   break;
				}
				 break;
       			 case 2 :
			     System.out.println("please select the RegionalPack required");
		         	System.out.println("1.Kannada");
		        	 System.out.println("2.English");
				 System.out.println("3.exit");
				 int reg=s.nextInt();

				 switch (reg)
				 {
				 case 1 : regionalpack.add(new RegionalPack("Kannada",200.0));
				          System.out.println("your regional pack Kannada has been successfully added");
						  break;
                 		case 2 : regionalpack.add(new RegionalPack("English",150.0));
				          System.out.println("your regional pack English has been successfully added");
						  break;
                		 case 3 : flag=false;
				          break;
				 }
	            		 break;
		
        	case 3 : Scanner sc=new Scanner(System.in);
			     System.out.println("enter the Channel name");
		         String removechannal=sc.next();
				 Iterator i=channel.iterator();
                    		while(i.hasNext())
	              		  {
					    Channel c1=(Channel)i.next();
						if(removechannal.equals(c1.cname))
						{
						   	i.remove();
							System.out.println("your channel"+removechannal+ " has removed");
					    	}
					    	else
						{
						 	 System.out.println("their is no channel to remove");
						}
						  break;
				}
				 break;
        
		case 4 : Scanner scc=new Scanner(System.in);
			     	System.out.println("enter the regionalPack name");
		         	String removereg=scc.nextLine();                 
				 Iterator i1=regionalpack.iterator();
				 while(i1.hasNext())
				    {
					  RegionalPack c2=(RegionalPack)i1.next();
					   if(removereg.equals(c2.rname))
					   {
						i1.remove();
						System.out.println("your regionalpack "+removereg + " has removed");
					   }
					   else 
						{
						    System.out.println("their is no regional pack to remove");
						}
						break;
				}
				  break;
       
		case 5 : flag=false;
	            	 break;
	  }
	}while(flag);
	}


public void myAccount()
	{
	Scanner sc=new Scanner(System.in);
	boolean flag= true;
	do{
	System.out.println("---------------------------------------------------------------------------------------------------------------");
	System.out.println("1.Personal details");
	System.out.println("2.Modify Details");
	System.out.println("3.Exit");
	System.out.println("====================================================================");
	System.out.println("Enter your Choice");
	int choice = sc.nextInt();
	switch (choice)
	{
	case 1:
	{

	System.out.println("Personal Details of the User");
	System.out.println("1. Name of the User "+tname);
	System.out.println("2. Date of Birth of the user "+DOB);
	System.out.println(" 3.Contact Number of the User "+contact_no);
	System.out.println("4.Email Id of the User "+email_id);
	break;
	}
	case 2:
	{

	System.out.println("1.Modify the User Name");
	System.out.println("2.Modify the Date of Birth of the User");
	System.out.println("3.Modify  the Contact Number of the User");
	System.out.println("4.Modify  the Email ID of  User");
    System.out.println("--------------------------------------------------------------------------");
	System.out.println("Enter your Option");
	char option = sc.next().charAt(0);
	switch(option)
		{
		case '1':
			{
				System.out.println("Enter The  name");
				String n=sc.nextLine();
				n=sc.nextLine();
				this.tname=n;
				System.out.println("User name is Successfully modified as:"+tname);
				break;
			}
		case '2':
			{
				System.out.println("Enter The  DAte of Birth");
				String n=sc.nextLine();
				n=sc.nextLine();
				this.DOB=n;
				System.out.println("User Date of Birth is Successfully modified as:"+DOB);
				break;
			}

		case '3':
			{
				System.out.println("Enter The  Email Id ");
				String n=sc.nextLine();
				n=sc.nextLine();
				this.email_id=n;
				System.out.println("User Email id is Successfully modified as:"+email_id);
				break;
			}

			//default:
			//{
				//System.out.println("Enter Valid Option");
			//}
		} //break;
	}




		case 3 : flag=false;
	            	 break;
	  }
	}while(flag);
	}


   	public void recharge()
	{
	   	int sum=0;
	   	for(Object O : channel)
		{
		   Channel cr=(Channel)O;
		   sum+=cr.cprice;
		}

		for(Object O : regionalpack)
		{
		   RegionalPack rr=(RegionalPack)O;
		   sum+=rr.rprice;
		}

		System.out.println("total amount you have pay is " + sum);
	}
}



class TataSkyMain
{
	public static void main(String[] args)
	{
		TataSky ta=new TataSky();
		Scanner sc=new Scanner(System.in);
		int j=0;
		do
		{
		System.out.println("**************");
        	System.out.println("1.modifypack");
		System.out.println("2.myaccount");
		System.out.println("3.recharge");
		System.out.println("4.exit");
		System.out.println("**************");
		int ts=sc.nextInt();

		switch (ts)
		{
		case 1 : ta.modifyPack();
		         break;
        	case 2 : ta.myAccount();
		         break;
       		 case 3 : ta.recharge();
		         break;
        	case 4 : j=1;
		         break;
        	default : System.out.println("select the correct option");
		         break;
		}
		}
		while(j==0);
	}
}