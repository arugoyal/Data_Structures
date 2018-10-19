//Given some number of villages and hospitals.We have to allocate hospitals to villages such that every village gets atleast 1 hospital
//and load on each hospital is minimized.

import java.util.PriorityQueue;
import java.util.Collections;

class village_hospital implements Comparable <village_hospital> {
    private final int population;
    private int hospital;
    
    public village_hospital (int pop) {
	population = pop;
	hospital = 1;
    }

    public void addHospital() {
	hospital++;
    }

    @Override
    public int compareTo(village_hospital v) {
	float d1 = this.getDensity();
	float d2 = v.getDensity();

	if (d1 == d2) return 0;
	else if (d1 > d2) return 1;
	
	return -1;
    }

    public int getDensity() {
	return (population / hospital);
    }

    public static void main(String[] args) {
	PriorityQueue <village_hospital> q = new PriorityQueue <village_hospital>(Collections.reverseOrder());
	q.add(new village_hospital(500));
	q.add(new village_hospital(300));
	q.add(new village_hospital(200));
	int m = 5;
	m = m - 3;
	while (m > 0) {
	    village_hospital temp = q.poll();
	    temp.addHospital();
	    q.add(temp);
	    m--;
	}
	System.out.println(q.poll().getDensity());
    }

}
