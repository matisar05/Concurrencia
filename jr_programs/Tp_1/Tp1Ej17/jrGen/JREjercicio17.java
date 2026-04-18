/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JREjercicio17
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_mayorImpares_voidTovoid;
	public Cap_ext_ JRget_op_mayorImpares_voidTovoid() {
		return op_mayorImpares_voidTovoid;
	}
	public void JRset_op_mayorImpares_voidTovoid(Cap_ext_ op_mayorImpares_voidTovoid) {
		this.op_mayorImpares_voidTovoid = op_mayorImpares_voidTovoid;
	}

	public Cap_ext_ op_mayorPares_voidTovoid;
	public Cap_ext_ JRget_op_mayorPares_voidTovoid() {
		return op_mayorPares_voidTovoid;
	}
	public void JRset_op_mayorPares_voidTovoid(Cap_ext_ op_mayorPares_voidTovoid) {
		this.op_mayorPares_voidTovoid = op_mayorPares_voidTovoid;
	}

	public JREjercicio17(JREjercicio17 copy)
	{
	this.op_mayorImpares_voidTovoid = copy.op_mayorImpares_voidTovoid;
	this.op_mayorPares_voidTovoid = copy.op_mayorPares_voidTovoid;

	}
	public JREjercicio17(Object ... opSig)
	{
	this.op_mayorImpares_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_mayorPares_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);

	}
	public JREjercicio17(boolean dummy)	{
	    super(dummy);
	this.op_mayorImpares_voidTovoid = Cap_ext_.noop;
	this.op_mayorPares_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JREjercicio17(true);
	}
    }
