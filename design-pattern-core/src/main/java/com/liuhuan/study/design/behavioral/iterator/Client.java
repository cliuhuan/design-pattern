package com.liuhuan.study.design.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		//����ѧԺ
		List<College> collegeList = new ArrayList<College>();

		ComputerCollege computerCollege = new ComputerCollege();
		InfoCollege infoCollege = new InfoCollege();

		collegeList.add(computerCollege);
		collegeList.add(infoCollege);

		OutPutImpl outPutImpl = new OutPutImpl(collegeList);
		outPutImpl.printCollege();
	}

}
