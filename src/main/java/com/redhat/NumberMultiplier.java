package com.redhat;

import com.redhat.handler.HatMultiplierHander;
import com.redhat.handler.MultiplierHander;
import com.redhat.handler.RedHatMultiplierHander;
import com.redhat.handler.RedMultiplierHander;

public class NumberMultiplier {
	MultiplierHander multiplierHander;

	public NumberMultiplier() {
		multiplierHander = new RedHatMultiplierHander(new HatMultiplierHander(new RedMultiplierHander()));
	}
	
	public void printMultiplierNumber(){
		for(int i=1; i<=100; i++){
			System.out.format(" %s",  multiplierHander.multiplierResult(i));
		}
	}
	
	public static void main(String[] args) {
		NumberMultiplier nm = new NumberMultiplier();
		nm.printMultiplierNumber();
	}

}
