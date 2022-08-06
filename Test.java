package com.main;

public class Test {

	public static String reduceString(String str1) {
		int firstindex=0;
		int lastindex=2;
		int count=1;
			while(str1.length()>count) {
				String reduced=redSub(str1.substring(firstindex, lastindex));
				if(str1.length()<=2) {
					String check=small(str1);
					str1=check;
					break;
				}
				if(reduced.length()==2) {
					firstindex++;
					lastindex++;
				}
				else {
					if(firstindex==0 && lastindex==2) {
						String newreduced=str1.substring(lastindex, str1.length());
						str1=reduced+newreduced;
						firstindex=0;
						lastindex=2;
					}
					else if(firstindex!=0 && lastindex!=2) {
						str1=str1.replace(str1.substring(firstindex, lastindex), reduced);
						firstindex=0;
						lastindex=2;
					}
				}
			}
		return str1;
	}

	public static String small(String str) {
		if(str.length()<=2) {
			String reduced=redSub(str.substring(0, 2));
			if(reduced.equals(str)) {
				return str;
			}
			else if(!reduced.equals(str)) {
				return str=reduced;
			}
		}
		return null;
	}

	public static String redSub(String str) {

		if(str.equals("ab")) {
			return "c";
		}
		else if(str.equals("ac")) {
			return "b";
		}
		else if(str.equals("ba")) {
			return "c";
		}
		else if(str.equals("ba")) {
			return "a";
		}
		else if(str.equals("ca")) {
			return "b";
		}
		else if(str.equals("cb")) {
			return "a";
		}
		return str;
	}

	public static void main(String[] args) {

		//		Scanner scanner=new Scanner(System.in);
		//		System.out.println("Enter First String");
		//		String firststring=scanner.next();
		String firststring="abcabca";
		System.out.println("Result after Reduction: "+reduceString(firststring));
	}
}
