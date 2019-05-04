package com.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class DVDInfo implements Comparable<DVDInfo>{
	String title;
	String genre;
	String leadActor;

	DVDInfo(String t, String g, String a) {
		title = t;
		genre = g;
		leadActor = a;
	}

	public String toString() {
		return title + " " + genre + " " + leadActor + "\n";
	}

	public int compareTo(DVDInfo d) {
		return title.compareTo(d.getTitle());
	}

	public String getTitle() {
		return title;
	}
	// other getters and setters

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	public static void main(String[] args) {
		DVDInfo dvdInfo=new DVDInfo("first", "2", "leadactor");
		DVDInfo dvdInfo2=new DVDInfo("second", "1", "leadactor");
		ArrayList<DVDInfo> stufff = new ArrayList<DVDInfo>(); // #1
		stufff.add(dvdInfo);
		stufff.add(dvdInfo2);
		System.out.println("before"+stufff);
		Collections.sort(stufff);
		System.out.println("after"+stufff);
		Test test=new Test();
		Test test2=new Test();
		ArrayList<Test> testArraylist = new ArrayList<Test>(); // #1
		testArraylist.add(test);
		testArraylist.add(test2);
		Collections.sort(testArraylist,new Comparator<Test>(){

			@Override
			public int compare(Test o1, Test o2) {
				// TODO Auto-generated method stub
				return 0;
			}});
		/*dvdInfo.compareTo(dvdInfo2);*/
		//System.out.println(dvdInfo.compareTo(dvdInfo2));
	}

}
 class Test{
	int test;
}