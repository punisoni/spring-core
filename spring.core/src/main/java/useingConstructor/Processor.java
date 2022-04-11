package useingConstructor;

public class Processor 
{
String processorName;
String RAM;
public String getProcessorName() {
	return processorName;
}
public void setProcessorName(String processorName) {
	this.processorName = processorName;
}
public String getRAM() {
	return RAM;
}
public void setRAM(String rAM) {
	RAM = rAM;
}
public Processor(String processorName, String rAM) {
	super();
	
}
@Override
public String toString() {
	return "Processor [processorName=" + processorName + ", RAM=" + RAM + "]";
}

}
