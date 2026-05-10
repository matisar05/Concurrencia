/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRej12
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_ataqueBacterias_voidTovoid;
	public Cap_ext_ JRget_op_ataqueBacterias_voidTovoid() {
		return op_ataqueBacterias_voidTovoid;
	}
	public void JRset_op_ataqueBacterias_voidTovoid(Cap_ext_ op_ataqueBacterias_voidTovoid) {
		this.op_ataqueBacterias_voidTovoid = op_ataqueBacterias_voidTovoid;
	}

	public Cap_ext_ op_organismo_voidTovoid;
	public Cap_ext_ JRget_op_organismo_voidTovoid() {
		return op_organismo_voidTovoid;
	}
	public void JRset_op_organismo_voidTovoid(Cap_ext_ op_organismo_voidTovoid) {
		this.op_organismo_voidTovoid = op_organismo_voidTovoid;
	}

	public Cap_ext_ op_mutex_voidTovoid;
	public Cap_ext_ JRget_op_mutex_voidTovoid() {
		return op_mutex_voidTovoid;
	}
	public void JRset_op_mutex_voidTovoid(Cap_ext_ op_mutex_voidTovoid) {
		this.op_mutex_voidTovoid = op_mutex_voidTovoid;
	}

	public Cap_ext_ op_ataqueTerminado_voidTovoid;
	public Cap_ext_ JRget_op_ataqueTerminado_voidTovoid() {
		return op_ataqueTerminado_voidTovoid;
	}
	public void JRset_op_ataqueTerminado_voidTovoid(Cap_ext_ op_ataqueTerminado_voidTovoid) {
		this.op_ataqueTerminado_voidTovoid = op_ataqueTerminado_voidTovoid;
	}

	public Cap_ext_ op_vulnerable_voidTovoid;
	public Cap_ext_ JRget_op_vulnerable_voidTovoid() {
		return op_vulnerable_voidTovoid;
	}
	public void JRset_op_vulnerable_voidTovoid(Cap_ext_ op_vulnerable_voidTovoid) {
		this.op_vulnerable_voidTovoid = op_vulnerable_voidTovoid;
	}

	public JRej12(JRej12 copy)
	{
	this.op_ataqueBacterias_voidTovoid = copy.op_ataqueBacterias_voidTovoid;
	this.op_organismo_voidTovoid = copy.op_organismo_voidTovoid;
	this.op_mutex_voidTovoid = copy.op_mutex_voidTovoid;
	this.op_ataqueTerminado_voidTovoid = copy.op_ataqueTerminado_voidTovoid;
	this.op_vulnerable_voidTovoid = copy.op_vulnerable_voidTovoid;

	}
	public JRej12(Object ... opSig)
	{
	this.op_ataqueBacterias_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_organismo_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_mutex_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_ataqueTerminado_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_vulnerable_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);

	}
	public JRej12(boolean dummy)	{
	    super(dummy);
	this.op_ataqueBacterias_voidTovoid = Cap_ext_.noop;
	this.op_organismo_voidTovoid = Cap_ext_.noop;
	this.op_mutex_voidTovoid = Cap_ext_.noop;
	this.op_ataqueTerminado_voidTovoid = Cap_ext_.noop;
	this.op_vulnerable_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRej12(true);
	}
    }
