
public class call {
	public call() {  }
	public call(Shape temp) {	//�θ� Shape�� temp�濡 ���� c������
		if(temp instanceof Circle) {
			Circle ct=(Circle)temp;	//�ٿ�ĳ��Ʈ
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
