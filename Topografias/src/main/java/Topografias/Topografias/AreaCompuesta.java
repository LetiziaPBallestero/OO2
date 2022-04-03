package Topografias.Topografias;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AreaCompuesta {
	private List<AreaCompuesta> child;

	public AreaCompuesta() {
		this.child = new ArrayList<>();
	}

	public void addTopo(AreaCompuesta topo) {
		this.child.add(topo);
	}

	public void removeTopo(AreaCompuesta topo) {
		this.child.remove(topo);
	}

	public double getAgua() {
		int cant = this.child.size();
		double agua = this.child.stream().mapToDouble(a -> a.getAgua()).sum();
		return agua / cant;
	}

	public double getTierra() {
		int cant = this.child.size();
		double t = this.child.stream().mapToDouble(a -> a.getTierra()).sum();
		return t / cant;
	}

	public boolean isThisASwamp() {
		return this.child.stream().anyMatch(a -> a.isThisASwamp());
	}

	public int getElementos() {
		return this.child.size();
	}

	/*
	 * equals de lorena
	 * 
	 * @Override public boolean equalsToTopoSimple(TopografiaSimple
	 * topografiaSimple) {
	 * 
	 * return topografiaSimple.proporcionAgua() == this.proporcionAgua(); }
	 * 
	 * 
	 * public boolean equals(Object o) { if (this.getClass() == o.getClass()) {
	 * Topografia topo = (Topografia) o; return topo.equalsToTopoSimple(this); }
	 * return false; }
	 */
	

}
