
public class call {
	public call() {  }
	public call(Shape temp) {	//부모가 Shape라서 temp방에 저장 c가저장
		if(temp instanceof Circle) {
			Circle ct=(Circle)temp;	//다운캐스트
			ct.setR(5);
			ct.area();
			ct.show();
		}
		else if(temp instanceof Rectangle)	{
			Rectangle rt=(Rectangle) temp;
			rt.setW(5);
			rt.setH(5);
			rt.area();
			rt.show();
		}
	
	else if(temp instanceof Triangle)	{
			Triangle tt=(Triangle)temp;
			tt.setW(5);
			tt.setH(6);
			tt.area();
			tt.show();
	}
	}
}
