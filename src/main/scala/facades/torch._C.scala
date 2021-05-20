package me.shadaj.scalapy.torch
import me.shadaj.scalapy.py
package object _C extends me.shadaj.scalapy.py.StaticModule("torch._C") {
@py.native trait _LegacyVariableBase extends me.shadaj.scalapy.stdlib.`object` {

}

object _LegacyVariableBase extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_LegacyVariableBase")) with py.Object {
def apply(data : /* Union[torch.tensor.Tensor, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], requires_grad : /* Union[builtins.bool, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], volatile : /* Union[builtins.bool, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], _grad_fn : /* Union[torch._C._FunctionBase, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch._C._LegacyVariableBase = as[me.shadaj.scalapy.py.Dynamic].applyNamed("data" -> data, "requires_grad" -> requires_grad, "volatile" -> volatile, "_grad_fn" -> _grad_fn).as[me.shadaj.scalapy.torch._C._LegacyVariableBase]
}
def _set_cudnn_enabled(arg : me.shadaj.scalapy.stdlib.bool): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_set_cudnn_enabled")(arg).as[me.shadaj.scalapy.py.None]
@py.native trait iinfo extends me.shadaj.scalapy.stdlib.`object` {
def min: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("min").as[me.shadaj.scalapy.stdlib.int]
def max: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("max").as[me.shadaj.scalapy.stdlib.int]
def bits: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("bits").as[me.shadaj.scalapy.stdlib.int]

}

object iinfo extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("iinfo")) with py.Object {
/* attribute: min */
/* attribute: max */
/* attribute: bits */
def apply(dtype : me.shadaj.scalapy.torch._C.dtype): me.shadaj.scalapy.torch._C.iinfo = as[me.shadaj.scalapy.py.Dynamic].applyNamed("dtype" -> dtype).as[me.shadaj.scalapy.torch._C.iinfo]
}
@py.native trait namedtuple_Q_R extends me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.torch.tensor.Tensor] {
/* member: _make */
/* skip override: __annotations__ */
def _field_defaults: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_field_defaults").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
/* skip override: __new__ */
def _field_types: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_field_types").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
/* member: _NT */
def Q: me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Q").as[me.shadaj.scalapy.torch.tensor.Tensor]
def _asdict(): me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_asdict")().as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
/* skip override: __doc__ */
def _replace[_NT <: me.shadaj.scalapy.py.Any](Q : me.shadaj.scalapy.torch.tensor.Tensor = null.asInstanceOf[me.shadaj.scalapy.torch.tensor.Tensor], R : me.shadaj.scalapy.torch.tensor.Tensor = null.asInstanceOf[me.shadaj.scalapy.torch.tensor.Tensor])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_NT]): _NT = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_replace")("Q" -> Q, "R" -> R).as[_NT]
def R: me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("R").as[me.shadaj.scalapy.torch.tensor.Tensor]
def _fields: /* Tuple[builtins.str, builtins.str] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_fields").as[/* Tuple[builtins.str, builtins.str] */ me.shadaj.scalapy.py.Any]
def _source: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_source").as[me.shadaj.scalapy.stdlib.str]
}

object namedtuple_Q_R extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("namedtuple_Q_R")) with py.Object {
/* member: _make */
/* attribute: __annotations__ */
/* attribute: _field_defaults */

/* attribute: _field_types */
/* member: _NT */
/* attribute: Q */

/* attribute: __doc__ */

/* attribute: R */
/* attribute: _fields */
/* attribute: _source */
}
def get_num_interop_threads(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("get_num_interop_threads")().as[me.shadaj.scalapy.stdlib.int]
@py.native trait Storage extends me.shadaj.scalapy.stdlib.`object` {

}

object Storage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Storage")) with py.Object {

}
def has_openmp: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("has_openmp").as[me.shadaj.scalapy.stdlib.bool]
def _from_dlpack(data : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_from_dlpack")(data).as[me.shadaj.scalapy.torch.tensor.Tensor]
@py.native trait namedtuple_a_tau extends me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.torch.tensor.Tensor] {
/* member: _make */
/* skip override: __annotations__ */
def _field_defaults: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_field_defaults").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
def _field_types: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_field_types").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
/* member: _NT */
def tau: me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("tau").as[me.shadaj.scalapy.torch.tensor.Tensor]
def _asdict(): me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_asdict")().as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
/* skip override: __doc__ */
def _replace[_NT <: me.shadaj.scalapy.py.Any](a : me.shadaj.scalapy.torch.tensor.Tensor = null.asInstanceOf[me.shadaj.scalapy.torch.tensor.Tensor], tau : me.shadaj.scalapy.torch.tensor.Tensor = null.asInstanceOf[me.shadaj.scalapy.torch.tensor.Tensor])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_NT]): _NT = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_replace")("a" -> a, "tau" -> tau).as[_NT]
def _fields: /* Tuple[builtins.str, builtins.str] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_fields").as[/* Tuple[builtins.str, builtins.str] */ me.shadaj.scalapy.py.Any]
def _source: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_source").as[me.shadaj.scalapy.stdlib.str]
def a: me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("a").as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip override: __new__ */
}

object namedtuple_a_tau extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("namedtuple_a_tau")) with py.Object {
/* member: _make */
/* attribute: __annotations__ */
/* attribute: _field_defaults */
/* attribute: _field_types */
/* member: _NT */
/* attribute: tau */

/* attribute: __doc__ */

/* attribute: _fields */
/* attribute: _source */
/* attribute: a */

}
@py.native trait CharTensor extends me.shadaj.scalapy.torch.tensor.Tensor {

}

object CharTensor extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("CharTensor")) with py.Object {

}
def _supported_qengines(): me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.int] = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_supported_qengines")().as[me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.int]]
def complex32: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("complex32").as[me.shadaj.scalapy.torch._C.dtype]
def _get_backcompat_keepdim_warn(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_get_backcompat_keepdim_warn")().as[me.shadaj.scalapy.stdlib.bool]
@py.native trait BenchmarkExecutionStats extends me.shadaj.scalapy.stdlib.`object` {
def num_iters: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("num_iters").as[me.shadaj.scalapy.stdlib.int]
def latency_avg_ms: me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("latency_avg_ms").as[me.shadaj.scalapy.stdlib.float]
}

object BenchmarkExecutionStats extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("BenchmarkExecutionStats")) with py.Object {
/* attribute: num_iters */
/* attribute: latency_avg_ms */
}
@py.native trait Generator extends me.shadaj.scalapy.stdlib.`object` {
def seed(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("seed")().as[me.shadaj.scalapy.stdlib.int]
def set_state(_new_state : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch._C.Generator = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("set_state")("_new_state" -> _new_state).as[me.shadaj.scalapy.torch._C.Generator]
def initial_seed(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("initial_seed")().as[me.shadaj.scalapy.stdlib.int]

def get_state(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("get_state")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def manual_seed(seed : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.torch._C.Generator = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("manual_seed")("seed" -> seed).as[me.shadaj.scalapy.torch._C.Generator]
def device: me.shadaj.scalapy.torch._C.device = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("device").as[me.shadaj.scalapy.torch._C.device]
}

object Generator extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Generator")) with py.Object {



def apply(device : /* Union[torch._C.device, builtins.str, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch._C.Generator = as[me.shadaj.scalapy.py.Dynamic].applyNamed("device" -> device).as[me.shadaj.scalapy.torch._C.Generator]


/* attribute: device */
}
@py.native trait _CudaStreamBase extends me.shadaj.scalapy.stdlib.`object` {
def priority: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("priority").as[me.shadaj.scalapy.stdlib.int]
def priority_range(): /* Tuple[builtins.int, builtins.int] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("priority_range")().as[/* Tuple[builtins.int, builtins.int] */ me.shadaj.scalapy.py.Any]
def device: me.shadaj.scalapy.torch._C.device = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("device").as[me.shadaj.scalapy.torch._C.device]
/* skip override: __new__ */
def synchronize(): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("synchronize")().as[me.shadaj.scalapy.py.None]
def query(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("query")().as[me.shadaj.scalapy.stdlib.bool]
def cuda_stream: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("cuda_stream").as[me.shadaj.scalapy.stdlib.int]
}

object _CudaStreamBase extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_CudaStreamBase")) with py.Object {
/* attribute: priority */

/* attribute: device */



/* attribute: cuda_stream */
}
def _autograd_init(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_autograd_init")().as[me.shadaj.scalapy.stdlib.bool]
def qint8: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("qint8").as[me.shadaj.scalapy.torch._C.dtype]
@py.native trait namedtuple_solution_QR extends me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.torch.tensor.Tensor] {
/* member: _make */
/* skip override: __annotations__ */
def _field_defaults: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_field_defaults").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
/* skip override: __new__ */
def _field_types: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_field_types").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
/* member: _NT */
def solution: me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("solution").as[me.shadaj.scalapy.torch.tensor.Tensor]
def QR: me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("QR").as[me.shadaj.scalapy.torch.tensor.Tensor]
def _asdict(): me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_asdict")().as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
/* skip override: __doc__ */
def _replace[_NT <: me.shadaj.scalapy.py.Any](solution : me.shadaj.scalapy.torch.tensor.Tensor = null.asInstanceOf[me.shadaj.scalapy.torch.tensor.Tensor], QR : me.shadaj.scalapy.torch.tensor.Tensor = null.asInstanceOf[me.shadaj.scalapy.torch.tensor.Tensor])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_NT]): _NT = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_replace")("solution" -> solution, "QR" -> QR).as[_NT]
def _fields: /* Tuple[builtins.str, builtins.str] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_fields").as[/* Tuple[builtins.str, builtins.str] */ me.shadaj.scalapy.py.Any]
def _source: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_source").as[me.shadaj.scalapy.stdlib.str]
}

object namedtuple_solution_QR extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("namedtuple_solution_QR")) with py.Object {
/* member: _make */
/* attribute: __annotations__ */
/* attribute: _field_defaults */

/* attribute: _field_types */
/* member: _NT */
/* attribute: solution */
/* attribute: QR */

/* attribute: __doc__ */

/* attribute: _fields */
/* attribute: _source */
}
def _has_distributed(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_has_distributed")().as[me.shadaj.scalapy.stdlib.bool]
def _is_xnnpack_enabled(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_is_xnnpack_enabled")().as[me.shadaj.scalapy.stdlib.bool]
def cfloat: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("cfloat").as[me.shadaj.scalapy.torch._C.dtype]
def int8: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("int8").as[me.shadaj.scalapy.torch._C.dtype]
def set_num_threads(nthreads : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("set_num_threads")(nthreads).as[me.shadaj.scalapy.py.None]
@py.native trait dtype extends me.shadaj.scalapy.stdlib.`object` {
def is_floating_point: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("is_floating_point").as[me.shadaj.scalapy.stdlib.bool]
def is_complex: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("is_complex").as[me.shadaj.scalapy.stdlib.bool]
def is_signed: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("is_signed").as[me.shadaj.scalapy.stdlib.bool]
}

object dtype extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("dtype")) with py.Object {
/* attribute: is_floating_point */
/* attribute: is_complex */
/* attribute: is_signed */
}
def _GLIBCXX_USE_CXX11_ABI: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_GLIBCXX_USE_CXX11_ABI").as[me.shadaj.scalapy.stdlib.bool]
def _show_config(): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_show_config")().as[me.shadaj.scalapy.stdlib.str]
def bfloat16: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("bfloat16").as[me.shadaj.scalapy.torch._C.dtype]
def uint8: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("uint8").as[me.shadaj.scalapy.torch._C.dtype]
def has_cudnn: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("has_cudnn").as[me.shadaj.scalapy.stdlib.bool]
def _set_default_dtype(d : me.shadaj.scalapy.torch._C.dtype): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_set_default_dtype")(d).as[me.shadaj.scalapy.py.None]
@py.native trait QInt8StorageBase extends me.shadaj.scalapy.stdlib.`object` {

}

object QInt8StorageBase extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("QInt8StorageBase")) with py.Object {

}
def get_num_thread(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("get_num_thread")().as[me.shadaj.scalapy.stdlib.int]
@py.native trait namedtuple_U_S_V extends me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.torch.tensor.Tensor] {
/* member: _make */
/* skip override: __annotations__ */
def U: me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("U").as[me.shadaj.scalapy.torch.tensor.Tensor]
def _field_defaults: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_field_defaults").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
/* skip override: __new__ */
def _field_types: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_field_types").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
/* member: _NT */
def V: me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("V").as[me.shadaj.scalapy.torch.tensor.Tensor]
def _asdict(): me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_asdict")().as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
/* skip override: __doc__ */
def _replace[_NT <: me.shadaj.scalapy.py.Any](U : me.shadaj.scalapy.torch.tensor.Tensor = null.asInstanceOf[me.shadaj.scalapy.torch.tensor.Tensor], S : me.shadaj.scalapy.torch.tensor.Tensor = null.asInstanceOf[me.shadaj.scalapy.torch.tensor.Tensor], V : me.shadaj.scalapy.torch.tensor.Tensor = null.asInstanceOf[me.shadaj.scalapy.torch.tensor.Tensor])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_NT]): _NT = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_replace")("U" -> U, "S" -> S, "V" -> V).as[_NT]
def S: me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("S").as[me.shadaj.scalapy.torch.tensor.Tensor]
def _fields: /* Tuple[builtins.str, builtins.str, builtins.str] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_fields").as[/* Tuple[builtins.str, builtins.str, builtins.str] */ me.shadaj.scalapy.py.Any]
def _source: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_source").as[me.shadaj.scalapy.stdlib.str]
}

object namedtuple_U_S_V extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("namedtuple_U_S_V")) with py.Object {
/* member: _make */
/* attribute: __annotations__ */
/* attribute: U */
/* attribute: _field_defaults */

/* attribute: _field_types */
/* member: _NT */
/* attribute: V */

/* attribute: __doc__ */

/* attribute: S */
/* attribute: _fields */
/* attribute: _source */
}
@py.native trait _CudaEventBase extends me.shadaj.scalapy.stdlib.`object` {
def ipc_handle(): me.shadaj.scalapy.stdlib.bytes = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("ipc_handle")().as[me.shadaj.scalapy.stdlib.bytes]
def wait(stream : me.shadaj.scalapy.torch._C._CudaStreamBase): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("wait")("stream" -> stream).as[me.shadaj.scalapy.py.None]
def cuda_event: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("cuda_event").as[me.shadaj.scalapy.stdlib.int]
def query(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("query")().as[me.shadaj.scalapy.stdlib.bool]
/* member: from_ipc_handle */
def elapsed_time(other : me.shadaj.scalapy.torch._C._CudaEventBase): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("elapsed_time")("other" -> other).as[me.shadaj.scalapy.stdlib.float]
/* skip override: __new__ */
def synchronize(): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("synchronize")().as[me.shadaj.scalapy.py.None]
def record(stream : me.shadaj.scalapy.torch._C._CudaStreamBase): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("record")("stream" -> stream).as[me.shadaj.scalapy.py.None]
def device: me.shadaj.scalapy.torch._C.device = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("device").as[me.shadaj.scalapy.torch._C.device]
}

object _CudaEventBase extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_CudaEventBase")) with py.Object {


/* attribute: cuda_event */

/* member: from_ipc_handle */




/* attribute: device */
}
def float: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("float").as[me.shadaj.scalapy.torch._C.dtype]
def _to_dlpack(data : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_to_dlpack")(data).as[me.shadaj.scalapy.py.Any]
def _crash_if_csrc_asan(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_crash_if_csrc_asan")().as[me.shadaj.scalapy.stdlib.int]
def _infer_size(arg1 : me.shadaj.scalapy.torch._C.Size, arg2 : me.shadaj.scalapy.torch._C.Size): me.shadaj.scalapy.torch._C.Size = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_infer_size")(arg1, arg2).as[me.shadaj.scalapy.torch._C.Size]
@py.native trait LongStorageBase extends me.shadaj.scalapy.stdlib.`object` {

}

object LongStorageBase extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("LongStorageBase")) with py.Object {

}
/* TypeVarExpr:18() */
@py.native trait _CudaDeviceProperties extends me.shadaj.scalapy.stdlib.`object` {
def name: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("name").as[me.shadaj.scalapy.stdlib.str]
def is_multi_gpu_board: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("is_multi_gpu_board").as[me.shadaj.scalapy.stdlib.int]
def total_memory: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("total_memory").as[me.shadaj.scalapy.stdlib.int]
def multi_processor_count: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("multi_processor_count").as[me.shadaj.scalapy.stdlib.int]
def minor: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("minor").as[me.shadaj.scalapy.stdlib.int]
def major: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("major").as[me.shadaj.scalapy.stdlib.int]
def is_integrated: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("is_integrated").as[me.shadaj.scalapy.stdlib.int]
}

object _CudaDeviceProperties extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_CudaDeviceProperties")) with py.Object {
/* attribute: name */
/* attribute: is_multi_gpu_board */
/* attribute: total_memory */
/* attribute: multi_processor_count */
/* attribute: minor */
/* attribute: major */
/* attribute: is_integrated */
}
def set_num_interop_threads(nthreads : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("set_num_interop_threads")(nthreads).as[me.shadaj.scalapy.py.None]
def short: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("short").as[me.shadaj.scalapy.torch._C.dtype]
@py.native trait ComplexFloatStorageBase extends me.shadaj.scalapy.stdlib.`object` {

}

object ComplexFloatStorageBase extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ComplexFloatStorageBase")) with py.Object {

}
@py.native trait DoubleTensor extends me.shadaj.scalapy.torch.tensor.Tensor {

}

object DoubleTensor extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("DoubleTensor")) with py.Object {

}
def _set_qengine(qegine : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_set_qengine")(qegine).as[me.shadaj.scalapy.py.None]
def _set_mkldnn_enabled(arg : me.shadaj.scalapy.stdlib.bool): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_set_mkldnn_enabled")(arg).as[me.shadaj.scalapy.py.None]
def _crash_if_aten_asan(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_crash_if_aten_asan")().as[me.shadaj.scalapy.stdlib.int]
@py.native trait Size extends me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.stdlib.int] {

}

object Size extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Size")) with py.Object {

}
@py.native trait IntStorageBase extends me.shadaj.scalapy.stdlib.`object` {

}

object IntStorageBase extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("IntStorageBase")) with py.Object {

}
@py.native trait LongTensor extends me.shadaj.scalapy.torch.tensor.Tensor {

}

object LongTensor extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("LongTensor")) with py.Object {

}
def preserve_format: me.shadaj.scalapy.torch._C.memory_format = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("preserve_format").as[me.shadaj.scalapy.torch._C.memory_format]
def set_flush_denormal(arg : me.shadaj.scalapy.stdlib.bool): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("set_flush_denormal")(arg).as[me.shadaj.scalapy.stdlib.bool]
def _add_docstr[T <: me.shadaj.scalapy.py.Any](obj : T, doc_obj : me.shadaj.scalapy.stdlib.str)(implicit retReader: me.shadaj.scalapy.readwrite.Reader[T]): T = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_add_docstr")(obj, doc_obj).as[T]
@py.native trait qscheme extends me.shadaj.scalapy.stdlib.`object` {

}

object qscheme extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("qscheme")) with py.Object {

}
def _set_default_tensor_type(`type` : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_set_default_tensor_type")(`type`).as[me.shadaj.scalapy.py.None]
@py.native trait FloatStorageBase extends me.shadaj.scalapy.stdlib.`object` {

}

object FloatStorageBase extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("FloatStorageBase")) with py.Object {

}
def float64: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("float64").as[me.shadaj.scalapy.torch._C.dtype]
/* MypyFile:1(
  /nix/store/cl0ngvh4xsdl25i66cji74qa5xf8k2lc-python3.8-pytorch-1.6.0/lib/python3.8/site-packages/torch/_C/_VariableFunctions.pyi) */
@py.native trait BenchmarkConfig extends me.shadaj.scalapy.stdlib.`object` {
def num_iters: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("num_iters").as[me.shadaj.scalapy.stdlib.int]
def profiler_output_path: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("profiler_output_path").as[me.shadaj.scalapy.stdlib.str]
def num_calling_threads: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("num_calling_threads").as[me.shadaj.scalapy.stdlib.int]
def num_warmup_iters: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("num_warmup_iters").as[me.shadaj.scalapy.stdlib.int]
def num_worker_threads: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("num_worker_threads").as[me.shadaj.scalapy.stdlib.int]
}

object BenchmarkConfig extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("BenchmarkConfig")) with py.Object {
/* attribute: num_iters */
/* attribute: profiler_output_path */
/* attribute: num_calling_threads */
/* attribute: num_warmup_iters */
/* attribute: num_worker_threads */
}
def _jit_pass_optimize_for_mobile(module : /* TypeInfo(
  Name(torch.jit.ScriptModule)
  Bases(builtins.object)
  Mro(torch.jit.ScriptModule, builtins.object)
  Names(
    __getattr__
    __init__
    __setattr__
    _replicate_for_data_parallel
    define
    forward (torch.jit._CachedForward))) */ me.shadaj.scalapy.py.Any): /* TypeInfo(
  Name(torch.jit.ScriptModule)
  Bases(builtins.object)
  Mro(torch.jit.ScriptModule, builtins.object)
  Names(
    __getattr__
    __init__
    __setattr__
    _replicate_for_data_parallel
    define
    forward (torch.jit._CachedForward))) */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_jit_pass_optimize_for_mobile")(module).as[/* TypeInfo(
  Name(torch.jit.ScriptModule)
  Bases(builtins.object)
  Mro(torch.jit.ScriptModule, builtins.object)
  Names(
    __getattr__
    __init__
    __setattr__
    _replicate_for_data_parallel
    define
    forward (torch.jit._CachedForward))) */ me.shadaj.scalapy.py.Any]
@py.native trait memory_format extends me.shadaj.scalapy.stdlib.`object` {

}

object memory_format extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("memory_format")) with py.Object {

}
def channels_last: me.shadaj.scalapy.torch._C.memory_format = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("channels_last").as[me.shadaj.scalapy.torch._C.memory_format]
@py.native trait QInt32StorageBase extends me.shadaj.scalapy.stdlib.`object` {

}

object QInt32StorageBase extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("QInt32StorageBase")) with py.Object {

}
def _set_cudnn_benchmark(arg : me.shadaj.scalapy.stdlib.bool): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_set_cudnn_benchmark")(arg).as[me.shadaj.scalapy.py.None]
def _get_default_device(): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_get_default_device")().as[me.shadaj.scalapy.stdlib.str]
def has_mkl: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("has_mkl").as[me.shadaj.scalapy.stdlib.bool]
def _init_names(arg : me.shadaj.scalapy.typing.Sequence[/* Type[Any] */ me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_init_names")(arg).as[me.shadaj.scalapy.py.None]
def _get_cudnn_benchmark(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_get_cudnn_benchmark")().as[me.shadaj.scalapy.stdlib.bool]
def _get_deterministic(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_get_deterministic")().as[me.shadaj.scalapy.stdlib.bool]
def int32: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("int32").as[me.shadaj.scalapy.torch._C.dtype]
@py.native trait CharStorageBase extends me.shadaj.scalapy.stdlib.`object` {

}

object CharStorageBase extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("CharStorageBase")) with py.Object {

}
def float16: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("float16").as[me.shadaj.scalapy.torch._C.dtype]
@py.native trait ByteTensor extends me.shadaj.scalapy.torch.tensor.Tensor {

}

object ByteTensor extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ByteTensor")) with py.Object {

}
@py.native trait DoubleStorageBase extends me.shadaj.scalapy.stdlib.`object` {

}

object DoubleStorageBase extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("DoubleStorageBase")) with py.Object {

}
def channels_last_3d: me.shadaj.scalapy.torch._C.memory_format = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("channels_last_3d").as[me.shadaj.scalapy.torch._C.memory_format]
def default_generator: me.shadaj.scalapy.torch._C.Generator = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("default_generator").as[me.shadaj.scalapy.torch._C.Generator]
@py.native trait HalfTensor extends me.shadaj.scalapy.torch.tensor.Tensor {

}

object HalfTensor extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("HalfTensor")) with py.Object {

}
def complex128: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("complex128").as[me.shadaj.scalapy.torch._C.dtype]
def get_default_dtype(): me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("get_default_dtype")().as[me.shadaj.scalapy.torch._C.dtype]
def half: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("half").as[me.shadaj.scalapy.torch._C.dtype]
def per_tensor_affine: me.shadaj.scalapy.torch._C.qscheme = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("per_tensor_affine").as[me.shadaj.scalapy.torch._C.qscheme]
def _parallel_info(): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_parallel_info")().as[me.shadaj.scalapy.stdlib.str]
@py.native trait ShortStorageBase extends me.shadaj.scalapy.stdlib.`object` {

}

object ShortStorageBase extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ShortStorageBase")) with py.Object {

}
def double: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("double").as[me.shadaj.scalapy.torch._C.dtype]
def has_mkldnn: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("has_mkldnn").as[me.shadaj.scalapy.stdlib.bool]
@py.native trait namedtuple_solution_cloned_coefficient extends me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.torch.tensor.Tensor] {
/* member: _make */
/* skip override: __annotations__ */
def _field_defaults: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_field_defaults").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
/* skip override: __new__ */
def _field_types: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_field_types").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
/* member: _NT */
def solution: me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("solution").as[me.shadaj.scalapy.torch.tensor.Tensor]
def _asdict(): me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_asdict")().as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
def _replace[_NT <: me.shadaj.scalapy.py.Any](solution : me.shadaj.scalapy.torch.tensor.Tensor = null.asInstanceOf[me.shadaj.scalapy.torch.tensor.Tensor], cloned_coefficient : me.shadaj.scalapy.torch.tensor.Tensor = null.asInstanceOf[me.shadaj.scalapy.torch.tensor.Tensor])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_NT]): _NT = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_replace")("solution" -> solution, "cloned_coefficient" -> cloned_coefficient).as[_NT]
def _fields: /* Tuple[builtins.str, builtins.str] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_fields").as[/* Tuple[builtins.str, builtins.str] */ me.shadaj.scalapy.py.Any]
def _source: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_source").as[me.shadaj.scalapy.stdlib.str]
def cloned_coefficient: me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("cloned_coefficient").as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip override: __doc__ */
}

object namedtuple_solution_cloned_coefficient extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("namedtuple_solution_cloned_coefficient")) with py.Object {
/* member: _make */
/* attribute: __annotations__ */
/* attribute: _field_defaults */

/* attribute: _field_types */
/* member: _NT */
/* attribute: solution */


/* attribute: _fields */
/* attribute: _source */
/* attribute: cloned_coefficient */
/* attribute: __doc__ */
}
def has_lapack: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("has_lapack").as[me.shadaj.scalapy.stdlib.bool]
def float32: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("float32").as[me.shadaj.scalapy.torch._C.dtype]
def long: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("long").as[me.shadaj.scalapy.torch._C.dtype]
@py.native trait finfo extends me.shadaj.scalapy.stdlib.`object` {
def tiny: me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("tiny").as[me.shadaj.scalapy.stdlib.float]
def min: me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("min").as[me.shadaj.scalapy.stdlib.float]

def max: me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("max").as[me.shadaj.scalapy.stdlib.float]
def eps: me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("eps").as[me.shadaj.scalapy.stdlib.float]
def bits: me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("bits").as[me.shadaj.scalapy.stdlib.float]
}

object finfo extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("finfo")) with py.Object {
/* attribute: tiny */
/* attribute: min */
def apply(dtype : me.shadaj.scalapy.torch._C.dtype): me.shadaj.scalapy.torch._C.finfo = as[me.shadaj.scalapy.py.Dynamic].applyNamed("dtype" -> dtype).as[me.shadaj.scalapy.torch._C.finfo]
def apply(): me.shadaj.scalapy.torch._C.finfo = as[me.shadaj.scalapy.py.Dynamic].applyNamed().as[me.shadaj.scalapy.torch._C.finfo]
/* attribute: max */
/* attribute: eps */
/* attribute: bits */
}
def _initExtension(shm_manager_path : me.shadaj.scalapy.stdlib.str): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_initExtension")(shm_manager_path).as[me.shadaj.scalapy.py.None]
@py.native trait ByteStorageBase extends me.shadaj.scalapy.stdlib.`object` {

}

object ByteStorageBase extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ByteStorageBase")) with py.Object {

}
def bool: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("bool").as[me.shadaj.scalapy.torch._C.dtype]
def _get_cudnn_deterministic(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_get_cudnn_deterministic")().as[me.shadaj.scalapy.stdlib.bool]
def _crash_if_csrc_ubsan(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_crash_if_csrc_ubsan")().as[me.shadaj.scalapy.stdlib.int]
@py.native trait ThroughputBenchmark extends me.shadaj.scalapy.stdlib.`object` {
def add_input(args : me.shadaj.scalapy.py.Any, kwargs : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("add_input")("args" -> args, "kwargs" -> kwargs).as[me.shadaj.scalapy.py.None]
def run_once(args : me.shadaj.scalapy.py.Any, kwargs : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("run_once")("args" -> args, "kwargs" -> kwargs).as[me.shadaj.scalapy.py.Any]

def benchmark(config : me.shadaj.scalapy.torch._C.BenchmarkConfig): me.shadaj.scalapy.torch._C.BenchmarkExecutionStats = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("benchmark")("config" -> config).as[me.shadaj.scalapy.torch._C.BenchmarkExecutionStats]
}

object ThroughputBenchmark extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ThroughputBenchmark")) with py.Object {


def apply(module : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch._C.ThroughputBenchmark = as[me.shadaj.scalapy.py.Dynamic].applyNamed("module" -> module).as[me.shadaj.scalapy.torch._C.ThroughputBenchmark]

}
def int16: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("int16").as[me.shadaj.scalapy.torch._C.dtype]
@py.native trait FloatTensor extends me.shadaj.scalapy.torch.tensor.Tensor {

}

object FloatTensor extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("FloatTensor")) with py.Object {

}
def _get_cudnn_enabled(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_get_cudnn_enabled")().as[me.shadaj.scalapy.stdlib.bool]
def int64: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("int64").as[me.shadaj.scalapy.torch._C.dtype]
def int: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("int").as[me.shadaj.scalapy.torch._C.dtype]
def contiguous_format: me.shadaj.scalapy.torch._C.memory_format = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("contiguous_format").as[me.shadaj.scalapy.torch._C.memory_format]
@py.native trait _FunctionBase extends me.shadaj.scalapy.stdlib.`object` {

}

object _FunctionBase extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_FunctionBase")) with py.Object {

}
@py.native trait QUInt8StorageBase extends me.shadaj.scalapy.stdlib.`object` {

}

object QUInt8StorageBase extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("QUInt8StorageBase")) with py.Object {

}
def `__package__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__package__").as[me.shadaj.scalapy.stdlib.str]
@py.native trait namedtuple_values_indices extends me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.torch.tensor.Tensor] {
/* member: _make */
def indices: me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("indices").as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip override: __annotations__ */
def _field_defaults: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_field_defaults").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
/* skip override: __new__ */
def _field_types: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_field_types").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
/* member: _NT */
def _asdict(): me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_asdict")().as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
def values: me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("values").as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip override: __doc__ */
def _replace[_NT <: me.shadaj.scalapy.py.Any](values : me.shadaj.scalapy.torch.tensor.Tensor = null.asInstanceOf[me.shadaj.scalapy.torch.tensor.Tensor], indices : me.shadaj.scalapy.torch.tensor.Tensor = null.asInstanceOf[me.shadaj.scalapy.torch.tensor.Tensor])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_NT]): _NT = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_replace")("values" -> values, "indices" -> indices).as[_NT]
def _fields: /* Tuple[builtins.str, builtins.str] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_fields").as[/* Tuple[builtins.str, builtins.str] */ me.shadaj.scalapy.py.Any]
def _source: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_source").as[me.shadaj.scalapy.stdlib.str]
}

object namedtuple_values_indices extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("namedtuple_values_indices")) with py.Object {
/* member: _make */
/* attribute: indices */
/* attribute: __annotations__ */
/* attribute: _field_defaults */

/* attribute: _field_types */
/* member: _NT */

/* attribute: values */
/* attribute: __doc__ */

/* attribute: _fields */
/* attribute: _source */
}
def `__name__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__name__").as[me.shadaj.scalapy.stdlib.str]
@py.native trait ComplexDoubleStorageBase extends me.shadaj.scalapy.stdlib.`object` {

}

object ComplexDoubleStorageBase extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ComplexDoubleStorageBase")) with py.Object {

}
def _jit_get_operation(op_name : me.shadaj.scalapy.stdlib.str): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_jit_get_operation")(op_name).as[me.shadaj.scalapy.py.Any]
@py.native trait namedtuple_solution_LU extends me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.torch.tensor.Tensor] {
/* member: _make */
/* skip override: __annotations__ */
/* skip override: __new__ */
def _field_types: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_field_types").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
/* member: _NT */
def solution: me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("solution").as[me.shadaj.scalapy.torch.tensor.Tensor]
def _asdict(): me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_asdict")().as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
/* skip override: __doc__ */
def _replace[_NT <: me.shadaj.scalapy.py.Any](solution : me.shadaj.scalapy.torch.tensor.Tensor = null.asInstanceOf[me.shadaj.scalapy.torch.tensor.Tensor], LU : me.shadaj.scalapy.torch.tensor.Tensor = null.asInstanceOf[me.shadaj.scalapy.torch.tensor.Tensor])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_NT]): _NT = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_replace")("solution" -> solution, "LU" -> LU).as[_NT]
def _fields: /* Tuple[builtins.str, builtins.str] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_fields").as[/* Tuple[builtins.str, builtins.str] */ me.shadaj.scalapy.py.Any]
def _source: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_source").as[me.shadaj.scalapy.stdlib.str]
def LU: me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("LU").as[me.shadaj.scalapy.torch.tensor.Tensor]
def _field_defaults: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_field_defaults").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
}

object namedtuple_solution_LU extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("namedtuple_solution_LU")) with py.Object {
/* member: _make */
/* attribute: __annotations__ */

/* attribute: _field_types */
/* member: _NT */
/* attribute: solution */

/* attribute: __doc__ */

/* attribute: _fields */
/* attribute: _source */
/* attribute: LU */
/* attribute: _field_defaults */
}
def quint8: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("quint8").as[me.shadaj.scalapy.torch._C.dtype]
def _set_backcompat_keepdim_warn(arg : me.shadaj.scalapy.stdlib.bool): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_set_backcompat_keepdim_warn")(arg).as[me.shadaj.scalapy.py.None]
@py.native trait _TensorBase extends me.shadaj.scalapy.stdlib.`object` {
def addmv(mat : me.shadaj.scalapy.torch.tensor.Tensor, vec : me.shadaj.scalapy.torch.tensor.Tensor, beta : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], alpha : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("addmv")("mat" -> mat, "vec" -> vec, "beta" -> beta, "alpha" -> alpha).as[me.shadaj.scalapy.torch.tensor.Tensor]
def floor_divide_(other : /* Union[torch.tensor.Tensor, Union[builtins.int, builtins.float, builtins.bool]] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("floor_divide_")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def __and__(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__and__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: __and__ */
/* skip conflict: __and__ */
def -(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__sub__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def put_(index : me.shadaj.scalapy.torch.tensor.Tensor, source : me.shadaj.scalapy.torch.tensor.Tensor, accumulate : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("put_")("index" -> index, "source" -> source, "accumulate" -> accumulate).as[me.shadaj.scalapy.torch.tensor.Tensor]
def map_(tensor : me.shadaj.scalapy.torch.tensor.Tensor, callable : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("map_")("tensor" -> tensor, "callable" -> callable).as[me.shadaj.scalapy.torch.tensor.Tensor]
def index_fill_(dim : me.shadaj.scalapy.stdlib.int, index : me.shadaj.scalapy.torch.tensor.Tensor, member_value : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("index_fill_")("dim" -> dim, "index" -> index, "value" -> member_value).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: index_fill_ */
/* skip conflict: index_fill_ */
/* skip conflict: index_fill_ */
def ndimension(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("ndimension")().as[me.shadaj.scalapy.stdlib.int]
def log1p_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("log1p_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def __div__(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__div__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def conj(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("conj")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def ger(vec2 : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("ger")("vec2" -> vec2).as[me.shadaj.scalapy.torch.tensor.Tensor]
def smm(mat2 : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("smm")("mat2" -> mat2).as[me.shadaj.scalapy.torch.tensor.Tensor]
def le(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("le")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: le */
def addr_(vec1 : me.shadaj.scalapy.torch.tensor.Tensor, vec2 : me.shadaj.scalapy.torch.tensor.Tensor, beta : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], alpha : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("addr_")("vec1" -> vec1, "vec2" -> vec2, "beta" -> beta, "alpha" -> alpha).as[me.shadaj.scalapy.torch.tensor.Tensor]
def mvlgamma(p : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("mvlgamma")("p" -> p).as[me.shadaj.scalapy.torch.tensor.Tensor]
def rad2deg(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rad2deg")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def relu_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("relu_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def __floordiv__(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__floordiv__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def logsumexp(dim : /* Union[builtins.int, Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]]] */ me.shadaj.scalapy.py.Any, keepdim : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("logsumexp")("dim" -> dim, "keepdim" -> keepdim).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: logsumexp */
def cholesky(upper : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("cholesky")("upper" -> upper).as[me.shadaj.scalapy.torch.tensor.Tensor]
def softmax(dim : me.shadaj.scalapy.stdlib.int, dtype : /* Union[torch._C.dtype, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("softmax")("dim" -> dim, "dtype" -> dtype).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: softmax */
def tan_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("tan_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def geometric_(p : me.shadaj.scalapy.stdlib.float, generator : /* Union[torch._C.Generator, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("geometric_")("p" -> p, "generator" -> generator).as[me.shadaj.scalapy.torch.tensor.Tensor]
def any(dim : me.shadaj.scalapy.stdlib.int, keepdim : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("any")("dim" -> dim, "keepdim" -> keepdim).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: any */
def any(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("any")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def lgamma_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("lgamma_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def q_per_channel_scales(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("q_per_channel_scales")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def dot(tensor : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("dot")("tensor" -> tensor).as[me.shadaj.scalapy.torch.tensor.Tensor]
def bmm(mat2 : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("bmm")("mat2" -> mat2).as[me.shadaj.scalapy.torch.tensor.Tensor]
def flatten(start_dim : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], end_dim : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("flatten")("start_dim" -> start_dim, "end_dim" -> end_dim).as[me.shadaj.scalapy.torch.tensor.Tensor]
def flatten(start_dim : me.shadaj.scalapy.stdlib.int, end_dim : me.shadaj.scalapy.stdlib.int, out_dim : /* Union[builtins.str, builtins.ellipsis, None] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("flatten")("start_dim" -> start_dim, "end_dim" -> end_dim, "out_dim" -> out_dim).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: flatten */
/* skip conflict: flatten */
def __radd__(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__radd__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def rad2deg_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rad2deg_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def is_complex(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("is_complex")().as[me.shadaj.scalapy.stdlib.bool]
def abs_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("abs_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def q_per_channel_zero_points(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("q_per_channel_zero_points")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def pin_memory(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("pin_memory")().as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip override: __eq__ */
def acosh(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("acosh")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def requires_grad: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("requires_grad").as[me.shadaj.scalapy.stdlib.bool]
def __bool__(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__bool__")().as[me.shadaj.scalapy.stdlib.bool]
def is_leaf: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("is_leaf").as[me.shadaj.scalapy.stdlib.bool]
def log10_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("log10_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def chunk(chunks : me.shadaj.scalapy.stdlib.int, dim : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): /* Union[builtins.tuple[torch.tensor.Tensor], builtins.list[torch.tensor.Tensor]] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("chunk")("chunks" -> chunks, "dim" -> dim).as[/* Union[builtins.tuple[torch.tensor.Tensor], builtins.list[torch.tensor.Tensor]] */ me.shadaj.scalapy.py.Any]
def coalesce(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("coalesce")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def log2(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("log2")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def renorm_(p : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any, dim : me.shadaj.scalapy.stdlib.int, maxnorm : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("renorm_")("p" -> p, "dim" -> dim, "maxnorm" -> maxnorm).as[me.shadaj.scalapy.torch.tensor.Tensor]
def sqrt_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sqrt_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def q_per_channel_axis(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("q_per_channel_axis")().as[me.shadaj.scalapy.stdlib.int]
def masked_select(mask : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("masked_select")("mask" -> mask).as[me.shadaj.scalapy.torch.tensor.Tensor]
def tolist(): me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("tolist")().as[me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.py.Any]]
def __rfloordiv__(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rfloordiv__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def copy_(src : me.shadaj.scalapy.torch.tensor.Tensor, non_blocking : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("copy_")("src" -> src, "non_blocking" -> non_blocking).as[me.shadaj.scalapy.torch.tensor.Tensor]
def dtype: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("dtype").as[me.shadaj.scalapy.torch._C.dtype]
def indices(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("indices")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def erf_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("erf_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def _version: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_version").as[me.shadaj.scalapy.stdlib.bool]
def dequantize(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("dequantize")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def det(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("det")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def trace(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("trace")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def remainder(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("remainder")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: remainder */
def tril(diagonal : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("tril")("diagonal" -> diagonal).as[me.shadaj.scalapy.torch.tensor.Tensor]
def real: me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("real").as[me.shadaj.scalapy.torch.tensor.Tensor]
def qr(some : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): /* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_Q_R] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("qr")("some" -> some).as[/* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_Q_R] */ me.shadaj.scalapy.py.Any]
def bfloat16(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("bfloat16")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def bitwise_and_(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("bitwise_and_")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: bitwise_and_ */
def __int__(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__int__")().as[me.shadaj.scalapy.stdlib.int]
def cos_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("cos_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def asin_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("asin_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def element_size(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("element_size")().as[me.shadaj.scalapy.stdlib.int]
def scatter_add(dim : me.shadaj.scalapy.stdlib.int, index : me.shadaj.scalapy.torch.tensor.Tensor, src : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("scatter_add")("dim" -> dim, "index" -> index, "src" -> src).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: scatter_add */
def __imul__(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__imul__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def sinh(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sinh")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def eig(eigenvectors : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): /* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_eigenvalues_eigenvectors] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("eig")("eigenvectors" -> eigenvectors).as[/* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_eigenvalues_eigenvectors] */ me.shadaj.scalapy.py.Any]
def size(): me.shadaj.scalapy.torch._C.Size = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("size")().as[me.shadaj.scalapy.torch._C.Size]
def size(_int : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("size")("_int" -> _int).as[me.shadaj.scalapy.stdlib.int]
def renorm(p : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any, dim : me.shadaj.scalapy.stdlib.int, maxnorm : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("renorm")("p" -> p, "dim" -> dim, "maxnorm" -> maxnorm).as[me.shadaj.scalapy.torch.tensor.Tensor]
def clamp_max(max : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("clamp_max")("max" -> max).as[me.shadaj.scalapy.torch.tensor.Tensor]
def div_(other : /* Union[torch.tensor.Tensor, Union[builtins.int, builtins.float, builtins.bool]] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("div_")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def permute(dims : /* Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("permute")("dims" -> dims).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: permute */
def rename_(names : /* Union[typing.Sequence[Union[builtins.str, builtins.ellipsis, None]], None] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rename_")("names" -> names).as[me.shadaj.scalapy.torch.tensor.Tensor]
def new_ones(size : /* Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]] */ me.shadaj.scalapy.py.Any, dtype : /* Union[torch._C.dtype, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], device : /* Union[torch._C.device, builtins.str, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], requires_grad : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("new_ones")("size" -> size, "dtype" -> dtype, "device" -> device, "requires_grad" -> requires_grad).as[me.shadaj.scalapy.torch.tensor.Tensor]
def expm1(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("expm1")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def log_softmax(dim : me.shadaj.scalapy.stdlib.int, dtype : /* Union[torch._C.dtype, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("log_softmax")("dim" -> dim, "dtype" -> dtype).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: log_softmax */
def neg_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("neg_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def contiguous(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("contiguous")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def index_add(dim : me.shadaj.scalapy.stdlib.int, index : me.shadaj.scalapy.torch.tensor.Tensor, source : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("index_add")("dim" -> dim, "index" -> index, "source" -> source).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: index_add */
def solve(A : me.shadaj.scalapy.torch.tensor.Tensor): /* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_solution_LU] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("solve")("A" -> A).as[/* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_solution_LU] */ me.shadaj.scalapy.py.Any]
def fmod(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("fmod")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: fmod */
def normal_(mean : me.shadaj.scalapy.stdlib.float = null.asInstanceOf[me.shadaj.scalapy.stdlib.float], std : me.shadaj.scalapy.stdlib.float = null.asInstanceOf[me.shadaj.scalapy.stdlib.float], generator : /* Union[torch._C.Generator, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("normal_")("mean" -> mean, "std" -> std, "generator" -> generator).as[me.shadaj.scalapy.torch.tensor.Tensor]
def float(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("float")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def asin(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("asin")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def __index__(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__index__")().as[me.shadaj.scalapy.stdlib.int]
def is_nonzero(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("is_nonzero")().as[me.shadaj.scalapy.stdlib.bool]
def is_sparse: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("is_sparse").as[me.shadaj.scalapy.stdlib.bool]
def dense_dim(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("dense_dim")().as[me.shadaj.scalapy.stdlib.int]
def sigmoid(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sigmoid")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def cuda(device : /* Union[torch._C.device, builtins.int, builtins.str, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], non_blocking : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("cuda")("device" -> device, "non_blocking" -> non_blocking).as[me.shadaj.scalapy.torch.tensor.Tensor]
def matrix_power(n : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("matrix_power")("n" -> n).as[me.shadaj.scalapy.torch.tensor.Tensor]
def clamp_max_(max : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("clamp_max_")("max" -> max).as[me.shadaj.scalapy.torch.tensor.Tensor]
def random_(from_ : me.shadaj.scalapy.stdlib.int, to : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any, generator : /* Union[torch._C.Generator, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("random_")("from_" -> from_, "to" -> to, "generator" -> generator).as[me.shadaj.scalapy.torch.tensor.Tensor]
// def random_(to : me.shadaj.scalapy.stdlib.int, generator : /* Union[torch._C.Generator, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("random_")("to" -> to, "generator" -> generator).as[me.shadaj.scalapy.torch.tensor.Tensor]
// def random_(generator : /* Union[torch._C.Generator, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("random_")("generator" -> generator).as[me.shadaj.scalapy.torch.tensor.Tensor]
def rfft(signal_ndim : me.shadaj.scalapy.stdlib.int, normalized : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool], onesided : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rfft")("signal_ndim" -> signal_ndim, "normalized" -> normalized, "onesided" -> onesided).as[me.shadaj.scalapy.torch.tensor.Tensor]
def names: me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.str] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("names").as[me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.str]]
def trunc_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("trunc_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def cummin(dim : me.shadaj.scalapy.stdlib.int): /* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_values_indices] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("cummin")("dim" -> dim).as[/* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_values_indices] */ me.shadaj.scalapy.py.Any]
/* skip conflict: cummin */
def bitwise_or(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("bitwise_or")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: bitwise_or */
def true_divide(other : /* Union[torch.tensor.Tensor, Union[builtins.int, builtins.float, builtins.bool]] */ me.shadaj.scalapy.py.Any, out : /* Union[torch.tensor.Tensor, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("true_divide")("other" -> other, "out" -> out).as[me.shadaj.scalapy.torch.tensor.Tensor]
def addbmm_(batch1 : me.shadaj.scalapy.torch.tensor.Tensor, batch2 : me.shadaj.scalapy.torch.tensor.Tensor, beta : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], alpha : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("addbmm_")("batch1" -> batch1, "batch2" -> batch2, "beta" -> beta, "alpha" -> alpha).as[me.shadaj.scalapy.torch.tensor.Tensor]
def erfinv(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("erfinv")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def t(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("t")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def sign_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sign_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def index_put_(indices : /* Union[builtins.tuple[torch.tensor.Tensor], builtins.list[torch.tensor.Tensor], None] */ me.shadaj.scalapy.py.Any, values : me.shadaj.scalapy.torch.tensor.Tensor, accumulate : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("index_put_")("indices" -> indices, "values" -> values, "accumulate" -> accumulate).as[me.shadaj.scalapy.torch.tensor.Tensor]
def angle(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("angle")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def fmod_(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("fmod_")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: fmod_ */
def short(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("short")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def acos_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("acos_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def all(dim : me.shadaj.scalapy.stdlib.int, keepdim : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("all")("dim" -> dim, "keepdim" -> keepdim).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: all */
def all(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("all")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def round_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("round_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def squeeze(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("squeeze")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def squeeze(dim : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("squeeze")("dim" -> dim).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: squeeze */
def erfinv_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("erfinv_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def scatter_add_(dim : me.shadaj.scalapy.stdlib.int, index : me.shadaj.scalapy.torch.tensor.Tensor, src : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("scatter_add_")("dim" -> dim, "index" -> index, "src" -> src).as[me.shadaj.scalapy.torch.tensor.Tensor]
def __xor__(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__xor__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: __xor__ */
/* skip conflict: __xor__ */
def flipud(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("flipud")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def __idiv__(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__idiv__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def addcdiv(tensor1 : me.shadaj.scalapy.torch.tensor.Tensor, tensor2 : me.shadaj.scalapy.torch.tensor.Tensor, member_value : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("addcdiv")("tensor1" -> tensor1, "tensor2" -> tensor2, "value" -> member_value).as[me.shadaj.scalapy.torch.tensor.Tensor]
def <(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__lt__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def data: me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("data").as[me.shadaj.scalapy.torch.tensor.Tensor]
def frac_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("frac_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def resize_(size : /* Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]] */ me.shadaj.scalapy.py.Any, memory_format : /* Union[torch._C.memory_format, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("resize_")("size" -> size, "memory_format" -> memory_format).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: resize_ */
def isfinite(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isfinite")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def slogdet(): /* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_sign_logabsdet] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("slogdet")().as[/* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_sign_logabsdet] */ me.shadaj.scalapy.py.Any]
/* skip override: __ne__ */
def __invert__(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__invert__")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def requires_grad_(mode : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("requires_grad_")("mode" -> mode).as[me.shadaj.scalapy.torch.tensor.Tensor]
def diag(diagonal : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("diag")("diagonal" -> diagonal).as[me.shadaj.scalapy.torch.tensor.Tensor]
def log_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("log_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def uniform_(from_ : me.shadaj.scalapy.stdlib.float = null.asInstanceOf[me.shadaj.scalapy.stdlib.float], to : me.shadaj.scalapy.stdlib.float = null.asInstanceOf[me.shadaj.scalapy.stdlib.float], generator : /* Union[torch._C.Generator, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("uniform_")("from_" -> from_, "to" -> to, "generator" -> generator).as[me.shadaj.scalapy.torch.tensor.Tensor]
def __isub__(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__isub__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def _dimI(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_dimI")().as[me.shadaj.scalapy.stdlib.int]
def rsqrt(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rsqrt")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def __rtruediv__(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rtruediv__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def square_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("square_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def add_(other : /* Union[torch.tensor.Tensor, Union[builtins.int, builtins.float, builtins.bool]] */ me.shadaj.scalapy.py.Any, alpha : /* Union[builtins.int, builtins.float, builtins.bool, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("add_")("other" -> other, "alpha" -> alpha).as[me.shadaj.scalapy.torch.tensor.Tensor]
def sinh_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sinh_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def logdet(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("logdet")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def true_divide_(other : /* Union[torch.tensor.Tensor, Union[builtins.int, builtins.float, builtins.bool]] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("true_divide_")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def log10(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("log10")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def pinverse(rcond : me.shadaj.scalapy.stdlib.float = null.asInstanceOf[me.shadaj.scalapy.stdlib.float]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("pinverse")("rcond" -> rcond).as[me.shadaj.scalapy.torch.tensor.Tensor]
def __itruediv__(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__itruediv__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def bitwise_xor_(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("bitwise_xor_")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: bitwise_xor_ */
def masked_scatter(mask : me.shadaj.scalapy.torch.tensor.Tensor, source : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("masked_scatter")("mask" -> mask, "source" -> source).as[me.shadaj.scalapy.torch.tensor.Tensor]
def masked_fill_(mask : me.shadaj.scalapy.torch.tensor.Tensor, member_value : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("masked_fill_")("mask" -> mask, "value" -> member_value).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: masked_fill_ */
def mul_(other : /* Union[torch.tensor.Tensor, Union[builtins.int, builtins.float, builtins.bool]] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("mul_")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def ne_(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("ne_")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: ne_ */
def logaddexp(other : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("logaddexp")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
// def mean(dtype : /* Union[torch._C.dtype, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("mean")("dtype" -> dtype).as[me.shadaj.scalapy.torch.tensor.Tensor]
def mean(dim : /* Union[builtins.int, Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]]] */ me.shadaj.scalapy.py.Any, keepdim : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool], dtype : /* Union[torch._C.dtype, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("mean")("dim" -> dim, "keepdim" -> keepdim, "dtype" -> dtype).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: mean */
def addcdiv_(tensor1 : me.shadaj.scalapy.torch.tensor.Tensor, tensor2 : me.shadaj.scalapy.torch.tensor.Tensor, member_value : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("addcdiv_")("tensor1" -> tensor1, "tensor2" -> tensor2, "value" -> member_value).as[me.shadaj.scalapy.torch.tensor.Tensor]
def as_strided(size : /* Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]] */ me.shadaj.scalapy.py.Any, stride : /* Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]] */ me.shadaj.scalapy.py.Any, storage_offset : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("as_strided")("size" -> size, "stride" -> stride, "storage_offset" -> storage_offset).as[me.shadaj.scalapy.torch.tensor.Tensor]
def addmm(mat1 : me.shadaj.scalapy.torch.tensor.Tensor, mat2 : me.shadaj.scalapy.torch.tensor.Tensor, beta : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], alpha : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("addmm")("mat1" -> mat1, "mat2" -> mat2, "beta" -> beta, "alpha" -> alpha).as[me.shadaj.scalapy.torch.tensor.Tensor]
def int_repr(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("int_repr")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def kthvalue(k : me.shadaj.scalapy.stdlib.int, dim : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], keepdim : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): /* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_values_indices] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("kthvalue")("k" -> k, "dim" -> dim, "keepdim" -> keepdim).as[/* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_values_indices] */ me.shadaj.scalapy.py.Any]
/* skip conflict: kthvalue */
def qscheme(): me.shadaj.scalapy.torch._C.qscheme = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("qscheme")().as[me.shadaj.scalapy.torch._C.qscheme]
def digamma_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("digamma_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def __setitem__(indices : /* Union[None, builtins.int, builtins.slice, torch.tensor.Tensor, builtins.list[Any], builtins.tuple[Any]] */ me.shadaj.scalapy.py.Any, `val` : /* Union[torch.tensor.Tensor, Union[builtins.int, builtins.float, builtins.bool]] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__setitem__")("indices" -> indices, "val" -> `val`).as[me.shadaj.scalapy.py.None]
def atanh_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("atanh_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def is_mkldnn: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("is_mkldnn").as[me.shadaj.scalapy.stdlib.bool]
def bernoulli_(p : me.shadaj.scalapy.torch.tensor.Tensor, generator : /* Union[torch._C.Generator, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("bernoulli_")("p" -> p, "generator" -> generator).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: bernoulli_ */
def unfold(dimension : me.shadaj.scalapy.stdlib.int, size : me.shadaj.scalapy.stdlib.int, step : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("unfold")("dimension" -> dimension, "size" -> size, "step" -> step).as[me.shadaj.scalapy.torch.tensor.Tensor]
def __mod__(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__mod__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def transpose_(dim0 : me.shadaj.scalapy.stdlib.int, dim1 : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("transpose_")("dim0" -> dim0, "dim1" -> dim1).as[me.shadaj.scalapy.torch.tensor.Tensor]
def div(other : /* Union[torch.tensor.Tensor, Union[builtins.int, builtins.float, builtins.bool]] */ me.shadaj.scalapy.py.Any, out : /* Union[torch.tensor.Tensor, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("div")("other" -> other, "out" -> out).as[me.shadaj.scalapy.torch.tensor.Tensor]
def min(dim : me.shadaj.scalapy.stdlib.int, keepdim : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): /* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_values_indices] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("min")("dim" -> dim, "keepdim" -> keepdim).as[/* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_values_indices] */ me.shadaj.scalapy.py.Any]
/* skip conflict: min */
def min(other : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("min")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def min(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("min")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def lstsq(A : me.shadaj.scalapy.torch.tensor.Tensor): /* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_solution_QR] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("lstsq")("A" -> A).as[/* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_solution_QR] */ me.shadaj.scalapy.py.Any]
def is_pinned(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("is_pinned")().as[me.shadaj.scalapy.stdlib.bool]
def lgamma(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("lgamma")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def addmv_(mat : me.shadaj.scalapy.torch.tensor.Tensor, vec : me.shadaj.scalapy.torch.tensor.Tensor, beta : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], alpha : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("addmv_")("mat" -> mat, "vec" -> vec, "beta" -> beta, "alpha" -> alpha).as[me.shadaj.scalapy.torch.tensor.Tensor]
def atan_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("atan_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def reciprocal_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("reciprocal_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def masked_fill(mask : me.shadaj.scalapy.torch.tensor.Tensor, member_value : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("masked_fill")("mask" -> mask, "value" -> member_value).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: masked_fill */
def is_quantized: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("is_quantized").as[me.shadaj.scalapy.stdlib.bool]
def logical_or(other : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("logical_or")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
// def std(unbiased : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("std")("unbiased" -> unbiased).as[me.shadaj.scalapy.torch.tensor.Tensor]
def std(dim : /* Union[builtins.int, Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]]] */ me.shadaj.scalapy.py.Any, unbiased : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool], keepdim : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("std")("dim" -> dim, "unbiased" -> unbiased, "keepdim" -> keepdim).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: std */
def apply_(callable : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("apply_")("callable" -> callable).as[me.shadaj.scalapy.torch.tensor.Tensor]
def ge(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("ge")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: ge */
def clamp(min : me.shadaj.scalapy.stdlib.float = null.asInstanceOf[me.shadaj.scalapy.stdlib.float], max : me.shadaj.scalapy.stdlib.float = null.asInstanceOf[me.shadaj.scalapy.stdlib.float], out : /* Union[torch.tensor.Tensor, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("clamp")("min" -> min, "max" -> max, "out" -> out).as[me.shadaj.scalapy.torch.tensor.Tensor]
def erfc(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("erfc")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def gt_(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("gt_")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: gt_ */
def cos(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("cos")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def *(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__mul__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def cosh_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("cosh_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def addmm_(mat1 : me.shadaj.scalapy.torch.tensor.Tensor, mat2 : me.shadaj.scalapy.torch.tensor.Tensor, beta : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], alpha : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("addmm_")("mat1" -> mat1, "mat2" -> mat2, "beta" -> beta, "alpha" -> alpha).as[me.shadaj.scalapy.torch.tensor.Tensor]
def log_normal_(mean : me.shadaj.scalapy.stdlib.float = null.asInstanceOf[me.shadaj.scalapy.stdlib.float], std : me.shadaj.scalapy.stdlib.float = null.asInstanceOf[me.shadaj.scalapy.stdlib.float], generator : /* Union[torch._C.Generator, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("log_normal_")("mean" -> mean, "std" -> std, "generator" -> generator).as[me.shadaj.scalapy.torch.tensor.Tensor]
def __neg__(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__neg__")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def __iadd__(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__iadd__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]

def get_device(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("get_device")().as[me.shadaj.scalapy.stdlib.int]
def char(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("char")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def index_fill(dim : me.shadaj.scalapy.stdlib.int, index : me.shadaj.scalapy.torch.tensor.Tensor, member_value : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("index_fill")("dim" -> dim, "index" -> index, "value" -> member_value).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: index_fill */
/* skip conflict: index_fill */
/* skip conflict: index_fill */
def backward(gradient : /* Union[torch.tensor.Tensor, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], retain_graph : /* Union[builtins.bool, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], create_graph : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("backward")("gradient" -> gradient, "retain_graph" -> retain_graph, "create_graph" -> create_graph).as[me.shadaj.scalapy.py.None]
def is_signed(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("is_signed")().as[me.shadaj.scalapy.stdlib.bool]
def cauchy_(median : me.shadaj.scalapy.stdlib.float = null.asInstanceOf[me.shadaj.scalapy.stdlib.float], sigma : me.shadaj.scalapy.stdlib.float = null.asInstanceOf[me.shadaj.scalapy.stdlib.float], generator : /* Union[torch._C.Generator, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("cauchy_")("median" -> median, "sigma" -> sigma, "generator" -> generator).as[me.shadaj.scalapy.torch.tensor.Tensor]
def absolute_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("absolute_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def matmul(other : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("matmul")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def exp(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("exp")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def deg2rad_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("deg2rad_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def inverse(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("inverse")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def cumprod(dim : me.shadaj.scalapy.stdlib.int, dtype : /* Union[torch._C.dtype, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("cumprod")("dim" -> dim, "dtype" -> dtype).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: cumprod */
def le_(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("le_")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: le_ */
def square(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("square")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def new_full(size : /* Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]] */ me.shadaj.scalapy.py.Any, fill_value : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any, dtype : /* Union[torch._C.dtype, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], layout : me.shadaj.scalapy.torch._C.layout = null.asInstanceOf[me.shadaj.scalapy.torch._C.layout], device : /* Union[torch._C.device, builtins.str, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], requires_grad : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("new_full")("size" -> size, "fill_value" -> fill_value, "dtype" -> dtype, "layout" -> layout, "device" -> device, "requires_grad" -> requires_grad).as[me.shadaj.scalapy.torch.tensor.Tensor]
def geqrf(): /* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_a_tau] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("geqrf")().as[/* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_a_tau] */ me.shadaj.scalapy.py.Any]
def atan(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("atan")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def neg(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("neg")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def __ixor__(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__ixor__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: __ixor__ */
/* skip conflict: __ixor__ */
def triu(diagonal : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("triu")("diagonal" -> diagonal).as[me.shadaj.scalapy.torch.tensor.Tensor]
def sum_to_size(size : /* Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sum_to_size")("size" -> size).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: sum_to_size */
def <=(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__le__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
// def to(dtype : me.shadaj.scalapy.torch._C.dtype, non_blocking : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool], copy : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("to")("dtype" -> dtype, "non_blocking" -> non_blocking, "copy" -> copy).as[me.shadaj.scalapy.torch.tensor.Tensor]
def to(device : /* Union[torch._C.device, builtins.str, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], dtype : /* Union[torch._C.dtype, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], non_blocking : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool], copy : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("to")("device" -> device, "dtype" -> dtype, "non_blocking" -> non_blocking, "copy" -> copy).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: to */
def erf(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("erf")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def __matmul__(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__matmul__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def expand(size : /* Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]] */ me.shadaj.scalapy.py.Any, `implicit` : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("expand")("size" -> size, "implicit" -> `implicit`).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: expand */
def ifft(signal_ndim : me.shadaj.scalapy.stdlib.int, normalized : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("ifft")("signal_ndim" -> signal_ndim, "normalized" -> normalized).as[me.shadaj.scalapy.torch.tensor.Tensor]
def _nnz(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_nnz")().as[me.shadaj.scalapy.stdlib.int]
def relu(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("relu")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def reshape(shape : /* Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("reshape")("shape" -> shape).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: reshape */
def double(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("double")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def scatter_(dim : me.shadaj.scalapy.stdlib.int, index : me.shadaj.scalapy.torch.tensor.Tensor, src : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("scatter_")("dim" -> dim, "index" -> index, "src" -> src).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: scatter_ */
def half(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("half")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def pow(exponent : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("pow")("exponent" -> exponent).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: pow */
def sparse_dim(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sparse_dim")().as[me.shadaj.scalapy.stdlib.int]
def ceil(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("ceil")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def clamp_(min : me.shadaj.scalapy.stdlib.float = null.asInstanceOf[me.shadaj.scalapy.stdlib.float], max : me.shadaj.scalapy.stdlib.float = null.asInstanceOf[me.shadaj.scalapy.stdlib.float]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("clamp_")("min" -> min, "max" -> max).as[me.shadaj.scalapy.torch.tensor.Tensor]
def index_copy(dim : me.shadaj.scalapy.stdlib.int, index : me.shadaj.scalapy.torch.tensor.Tensor, source : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("index_copy")("dim" -> dim, "index" -> index, "source" -> source).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: index_copy */
def detach(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("detach")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def cholesky_solve(input2 : me.shadaj.scalapy.torch.tensor.Tensor, upper : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("cholesky_solve")("input2" -> input2, "upper" -> upper).as[me.shadaj.scalapy.torch.tensor.Tensor]
def select(dim : /* Union[builtins.str, builtins.ellipsis, None] */ me.shadaj.scalapy.py.Any, index : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("select")("dim" -> dim, "index" -> index).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: select */
def __or__(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__or__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: __or__ */
/* skip conflict: __or__ */
def scatter(dim : me.shadaj.scalapy.stdlib.int, index : me.shadaj.scalapy.torch.tensor.Tensor, src : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("scatter")("dim" -> dim, "index" -> index, "src" -> src).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: scatter */
/* skip conflict: scatter */
/* skip conflict: scatter */
def q_zero_point(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("q_zero_point")().as[me.shadaj.scalapy.stdlib.int]
def new_empty(size : /* Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]] */ me.shadaj.scalapy.py.Any, dtype : /* Union[torch._C.dtype, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], layout : me.shadaj.scalapy.torch._C.layout = null.asInstanceOf[me.shadaj.scalapy.torch._C.layout], device : /* Union[torch._C.device, builtins.str, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], requires_grad : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("new_empty")("size" -> size, "dtype" -> dtype, "layout" -> layout, "device" -> device, "requires_grad" -> requires_grad).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: new_empty */
def dist(other : me.shadaj.scalapy.torch.tensor.Tensor, p : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("dist")("other" -> other, "p" -> p).as[me.shadaj.scalapy.torch.tensor.Tensor]
def sin_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sin_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def repeat_interleave(repeats : me.shadaj.scalapy.torch.tensor.Tensor, dim : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("repeat_interleave")("repeats" -> repeats, "dim" -> dim).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: repeat_interleave */
def long(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("long")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def sign(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sign")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def sub_(other : /* Union[torch.tensor.Tensor, Union[builtins.int, builtins.float, builtins.bool]] */ me.shadaj.scalapy.py.Any, alpha : /* Union[builtins.int, builtins.float, builtins.bool, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sub_")("other" -> other, "alpha" -> alpha).as[me.shadaj.scalapy.torch.tensor.Tensor]
def digamma(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("digamma")().as[me.shadaj.scalapy.torch.tensor.Tensor]
// def diagonal(offset : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], dim1 : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], dim2 : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("diagonal")("offset" -> offset, "dim1" -> dim1, "dim2" -> dim2).as[me.shadaj.scalapy.torch.tensor.Tensor]
def diagonal(outdim : /* Union[builtins.str, builtins.ellipsis, None] */ me.shadaj.scalapy.py.Any, dim1 : /* Union[builtins.str, builtins.ellipsis, None] */ me.shadaj.scalapy.py.Any, dim2 : /* Union[builtins.str, builtins.ellipsis, None] */ me.shadaj.scalapy.py.Any, offset : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("diagonal")("outdim" -> outdim, "dim1" -> dim1, "dim2" -> dim2, "offset" -> offset).as[me.shadaj.scalapy.torch.tensor.Tensor]
def triangular_solve(A : me.shadaj.scalapy.torch.tensor.Tensor, upper : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool], transpose : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool], unitriangular : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): /* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_solution_cloned_coefficient] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("triangular_solve")("A" -> A, "upper" -> upper, "transpose" -> transpose, "unitriangular" -> unitriangular).as[/* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_solution_cloned_coefficient] */ me.shadaj.scalapy.py.Any]
def roll(shifts : /* Union[builtins.int, Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]]] */ me.shadaj.scalapy.py.Any, dims : /* Union[builtins.int, Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]]] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("roll")("shifts" -> shifts, "dims" -> dims).as[me.shadaj.scalapy.torch.tensor.Tensor]
def polygamma_(n : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("polygamma_")("n" -> n).as[me.shadaj.scalapy.torch.tensor.Tensor]
def narrow_copy(dim : me.shadaj.scalapy.stdlib.int, start : me.shadaj.scalapy.stdlib.int, length : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("narrow_copy")("dim" -> dim, "start" -> start, "length" -> length).as[me.shadaj.scalapy.torch.tensor.Tensor]
def type_as(other : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("type_as")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def q_scale(): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("q_scale")().as[me.shadaj.scalapy.stdlib.float]
def lerp(end : me.shadaj.scalapy.torch.tensor.Tensor, weight : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("lerp")("end" -> end, "weight" -> weight).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: lerp */
def __float__(): me.shadaj.scalapy.stdlib.float = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__float__")().as[me.shadaj.scalapy.stdlib.float]
def log1p(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("log1p")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def new_zeros(size : /* Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]] */ me.shadaj.scalapy.py.Any, dtype : /* Union[torch._C.dtype, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], layout : me.shadaj.scalapy.torch._C.layout = null.asInstanceOf[me.shadaj.scalapy.torch._C.layout], device : /* Union[torch._C.device, builtins.str, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], requires_grad : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("new_zeros")("size" -> size, "dtype" -> dtype, "layout" -> layout, "device" -> device, "requires_grad" -> requires_grad).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: new_zeros */
def bitwise_not(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("bitwise_not")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def max(dim : me.shadaj.scalapy.stdlib.int, keepdim : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): /* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_values_indices] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("max")("dim" -> dim, "keepdim" -> keepdim).as[/* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_values_indices] */ me.shadaj.scalapy.py.Any]
/* skip conflict: max */
def max(other : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("max")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def max(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("max")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def _values(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_values")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def equal(other : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("equal")("other" -> other).as[me.shadaj.scalapy.stdlib.bool]
// def bernoulli(generator : /* Union[torch._C.Generator, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("bernoulli")("generator" -> generator).as[me.shadaj.scalapy.torch.tensor.Tensor]
def bernoulli(p : me.shadaj.scalapy.stdlib.float, generator : /* Union[torch._C.Generator, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("bernoulli")("p" -> p, "generator" -> generator).as[me.shadaj.scalapy.torch.tensor.Tensor]
def ceil_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("ceil_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def atan2(other : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("atan2")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def bool(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("bool")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def sqrt(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sqrt")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def symeig(eigenvectors : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool], upper : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): /* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_eigenvalues_eigenvectors] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("symeig")("eigenvectors" -> eigenvectors, "upper" -> upper).as[/* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_eigenvalues_eigenvectors] */ me.shadaj.scalapy.py.Any]
def bitwise_not_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("bitwise_not_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def take(index : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("take")("index" -> index).as[me.shadaj.scalapy.torch.tensor.Tensor]
def clamp_min_(min : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("clamp_min_")("min" -> min).as[me.shadaj.scalapy.torch.tensor.Tensor]
def to_mkldnn(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("to_mkldnn")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def median(dim : me.shadaj.scalapy.stdlib.int, keepdim : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): /* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_values_indices] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("median")("dim" -> dim, "keepdim" -> keepdim).as[/* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_values_indices] */ me.shadaj.scalapy.py.Any]
/* skip conflict: median */
def median(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("median")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def lerp_(end : me.shadaj.scalapy.torch.tensor.Tensor, weight : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("lerp_")("end" -> end, "weight" -> weight).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: lerp_ */
def >(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__gt__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def allclose(other : me.shadaj.scalapy.torch.tensor.Tensor, rtol : me.shadaj.scalapy.stdlib.float = null.asInstanceOf[me.shadaj.scalapy.stdlib.float], atol : me.shadaj.scalapy.stdlib.float = null.asInstanceOf[me.shadaj.scalapy.stdlib.float], equal_nan : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("allclose")("other" -> other, "rtol" -> rtol, "atol" -> atol, "equal_nan" -> equal_nan).as[me.shadaj.scalapy.stdlib.bool]
def topk(k : me.shadaj.scalapy.stdlib.int, dim : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], largest : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool], sorted : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): /* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_values_indices] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("topk")("k" -> k, "dim" -> dim, "largest" -> largest, "sorted" -> sorted).as[/* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_values_indices] */ me.shadaj.scalapy.py.Any]
def floor(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("floor")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def hardshrink(lambd : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("hardshrink")("lambd" -> lambd).as[me.shadaj.scalapy.torch.tensor.Tensor]
def mul(other : /* Union[torch.tensor.Tensor, Union[builtins.int, builtins.float, builtins.bool]] */ me.shadaj.scalapy.py.Any, out : /* Union[torch.tensor.Tensor, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("mul")("other" -> other, "out" -> out).as[me.shadaj.scalapy.torch.tensor.Tensor]
def is_contiguous(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("is_contiguous")().as[me.shadaj.scalapy.stdlib.bool]
def flip(dims : /* Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("flip")("dims" -> dims).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: flip */
def expand_as(other : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("expand_as")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip illegal name: clone */
def __pow__(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__pow__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def acosh_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("acosh_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def align_as(other : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("align_as")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def split_with_sizes(split_sizes : /* Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]] */ me.shadaj.scalapy.py.Any, dim : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): /* Union[builtins.tuple[torch.tensor.Tensor], builtins.list[torch.tensor.Tensor]] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("split_with_sizes")("split_sizes" -> split_sizes, "dim" -> dim).as[/* Union[builtins.tuple[torch.tensor.Tensor], builtins.list[torch.tensor.Tensor]] */ me.shadaj.scalapy.py.Any]
def logaddexp2(other : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("logaddexp2")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def int(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("int")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def bitwise_and(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("bitwise_and")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: bitwise_and */
def __rmul__(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rmul__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def addr(vec1 : me.shadaj.scalapy.torch.tensor.Tensor, vec2 : me.shadaj.scalapy.torch.tensor.Tensor, beta : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], alpha : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("addr")("vec1" -> vec1, "vec2" -> vec2, "beta" -> beta, "alpha" -> alpha).as[me.shadaj.scalapy.torch.tensor.Tensor]
def `new`(args : me.shadaj.scalapy.py.Any, device : /* Union[torch._C.device, builtins.str, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("new")("args" -> args, "device" -> device).as[me.shadaj.scalapy.torch.tensor.Tensor]
def `new`(storage : me.shadaj.scalapy.torch._C.Storage): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("new")("storage" -> storage).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: new */
/* skip conflict: new */
def __irshift__(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__irshift__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: __irshift__ */
/* skip conflict: __irshift__ */
def __nonzero__(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__nonzero__")().as[me.shadaj.scalapy.stdlib.bool]
def addcmul(tensor1 : me.shadaj.scalapy.torch.tensor.Tensor, tensor2 : me.shadaj.scalapy.torch.tensor.Tensor, member_value : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("addcmul")("tensor1" -> tensor1, "tensor2" -> tensor2, "value" -> member_value).as[me.shadaj.scalapy.torch.tensor.Tensor]
def cpu(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("cpu")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def squeeze_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("squeeze_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def squeeze_(dim : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("squeeze_")("dim" -> dim).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: squeeze_ */
def cholesky_inverse(upper : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("cholesky_inverse")("upper" -> upper).as[me.shadaj.scalapy.torch.tensor.Tensor]
def erfc_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("erfc_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def multinomial(num_samples : me.shadaj.scalapy.stdlib.int, replacement : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool], generator : /* Union[torch._C.Generator, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("multinomial")("num_samples" -> num_samples, "replacement" -> replacement, "generator" -> generator).as[me.shadaj.scalapy.torch.tensor.Tensor]
def masked_scatter_(mask : me.shadaj.scalapy.torch.tensor.Tensor, source : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("masked_scatter_")("mask" -> mask, "source" -> source).as[me.shadaj.scalapy.torch.tensor.Tensor]
def __lshift__(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__lshift__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: __lshift__ */
/* skip conflict: __lshift__ */
def clamp_min(min : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("clamp_min")("min" -> min).as[me.shadaj.scalapy.torch.tensor.Tensor]
def cross(other : me.shadaj.scalapy.torch.tensor.Tensor, dim : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("cross")("other" -> other, "dim" -> dim).as[me.shadaj.scalapy.torch.tensor.Tensor]
def cumsum(dim : me.shadaj.scalapy.stdlib.int, dtype : /* Union[torch._C.dtype, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("cumsum")("dim" -> dim, "dtype" -> dtype).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: cumsum */
def polygamma(n : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("polygamma")("n" -> n).as[me.shadaj.scalapy.torch.tensor.Tensor]
def sigmoid_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sigmoid_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def __getitem__(indices : /* Union[None, builtins.int, builtins.slice, torch.tensor.Tensor, builtins.list[Any], builtins.tuple[Any]] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__getitem__")("indices" -> indices).as[me.shadaj.scalapy.torch.tensor.Tensor]
def lu_solve(LU_data : me.shadaj.scalapy.torch.tensor.Tensor, LU_pivots : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("lu_solve")("LU_data" -> LU_data, "LU_pivots" -> LU_pivots).as[me.shadaj.scalapy.torch.tensor.Tensor]
def logical_not(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("logical_not")().as[me.shadaj.scalapy.torch.tensor.Tensor]
// def prod(dtype : /* Union[torch._C.dtype, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("prod")("dtype" -> dtype).as[me.shadaj.scalapy.torch.tensor.Tensor]
def prod(dim : me.shadaj.scalapy.stdlib.int, keepdim : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool], dtype : /* Union[torch._C.dtype, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("prod")("dim" -> dim, "keepdim" -> keepdim, "dtype" -> dtype).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: prod */
def __ior__(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__ior__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: __ior__ */
/* skip conflict: __ior__ */
def tanh(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("tanh")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def ge_(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("ge_")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: ge_ */
def diag_embed(offset : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], dim1 : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], dim2 : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("diag_embed")("offset" -> offset, "dim1" -> dim1, "dim2" -> dim2).as[me.shadaj.scalapy.torch.tensor.Tensor]
def mvlgamma_(p : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("mvlgamma_")("p" -> p).as[me.shadaj.scalapy.torch.tensor.Tensor]
def logical_and_(other : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("logical_and_")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def rsqrt_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rsqrt_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def exp_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("exp_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def as_strided_(size : /* Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]] */ me.shadaj.scalapy.py.Any, stride : /* Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]] */ me.shadaj.scalapy.py.Any, storage_offset : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("as_strided_")("size" -> size, "stride" -> stride, "storage_offset" -> storage_offset).as[me.shadaj.scalapy.torch.tensor.Tensor]
def _coalesced_(coalesced : me.shadaj.scalapy.stdlib.bool): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_coalesced_")("coalesced" -> coalesced).as[me.shadaj.scalapy.torch.tensor.Tensor]
def t_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("t_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def zero_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("zero_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def mode(dim : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], keepdim : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): /* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_values_indices] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("mode")("dim" -> dim, "keepdim" -> keepdim).as[/* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_values_indices] */ me.shadaj.scalapy.py.Any]
/* skip conflict: mode */
def /(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__truediv__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def atanh(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("atanh")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def mm(mat2 : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("mm")("mat2" -> mat2).as[me.shadaj.scalapy.torch.tensor.Tensor]
def values(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("values")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def sparse_resize_(size : /* Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]] */ me.shadaj.scalapy.py.Any, sparse_dim : me.shadaj.scalapy.stdlib.int, dense_dim : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sparse_resize_")("size" -> size, "sparse_dim" -> sparse_dim, "dense_dim" -> dense_dim).as[me.shadaj.scalapy.torch.tensor.Tensor]
def reshape_as(other : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("reshape_as")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def storage(): me.shadaj.scalapy.torch._C.Storage = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("storage")().as[me.shadaj.scalapy.torch._C.Storage]
def is_coalesced(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("is_coalesced")().as[me.shadaj.scalapy.stdlib.bool]
def __iand__(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__iand__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: __iand__ */
/* skip conflict: __iand__ */
def eq_(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("eq_")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: eq_ */
def storage_offset(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("storage_offset")().as[me.shadaj.scalapy.stdlib.int]
def sub(other : /* Union[torch.tensor.Tensor, Union[builtins.int, builtins.float, builtins.bool]] */ me.shadaj.scalapy.py.Any, alpha : /* Union[builtins.int, builtins.float, builtins.bool, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], out : /* Union[torch.tensor.Tensor, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sub")("other" -> other, "alpha" -> alpha, "out" -> out).as[me.shadaj.scalapy.torch.tensor.Tensor]
def round(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("round")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def __abs__(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__abs__")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def isclose(other : me.shadaj.scalapy.torch.tensor.Tensor, rtol : me.shadaj.scalapy.stdlib.float = null.asInstanceOf[me.shadaj.scalapy.stdlib.float], atol : me.shadaj.scalapy.stdlib.float = null.asInstanceOf[me.shadaj.scalapy.stdlib.float], equal_nan : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isclose")("other" -> other, "rtol" -> rtol, "atol" -> atol, "equal_nan" -> equal_nan).as[me.shadaj.scalapy.torch.tensor.Tensor]
def absolute(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("absolute")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def is_floating_point(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("is_floating_point")().as[me.shadaj.scalapy.stdlib.bool]
def expm1_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("expm1_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def dim(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("dim")().as[me.shadaj.scalapy.stdlib.int]
def log2_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("log2_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def where(condition : me.shadaj.scalapy.torch.tensor.Tensor, other : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("where")("condition" -> condition, "other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def transpose(dim0 : me.shadaj.scalapy.stdlib.int, dim1 : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("transpose")("dim0" -> dim0, "dim1" -> dim1).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: transpose */
def prelu(weight : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("prelu")("weight" -> weight).as[me.shadaj.scalapy.torch.tensor.Tensor]
def logical_not_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("logical_not_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def bincount(weights : /* Union[torch.tensor.Tensor, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], minlength : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("bincount")("weights" -> weights, "minlength" -> minlength).as[me.shadaj.scalapy.torch.tensor.Tensor]
def tril_(diagonal : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("tril_")("diagonal" -> diagonal).as[me.shadaj.scalapy.torch.tensor.Tensor]
def shape: me.shadaj.scalapy.torch._C.Size = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("shape").as[me.shadaj.scalapy.torch._C.Size]
def cosh(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("cosh")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def reciprocal(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("reciprocal")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def logical_xor(other : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("logical_xor")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def layout: me.shadaj.scalapy.torch._C.layout = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("layout").as[me.shadaj.scalapy.torch._C.layout]
def isnan(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isnan")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def numpy(): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("numpy")().as[me.shadaj.scalapy.py.Any]
def repeat(repeats : /* Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("repeat")("repeats" -> repeats).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: repeat */
def bitwise_xor(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("bitwise_xor")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: bitwise_xor */
def addcmul_(tensor1 : me.shadaj.scalapy.torch.tensor.Tensor, tensor2 : me.shadaj.scalapy.torch.tensor.Tensor, member_value : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("addcmul_")("tensor1" -> tensor1, "tensor2" -> tensor2, "value" -> member_value).as[me.shadaj.scalapy.torch.tensor.Tensor]
def logical_or_(other : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("logical_or_")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def __long__(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__long__")().as[me.shadaj.scalapy.stdlib.int]
def sparse_resize_and_clear_(size : /* Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]] */ me.shadaj.scalapy.py.Any, sparse_dim : me.shadaj.scalapy.stdlib.int, dense_dim : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sparse_resize_and_clear_")("size" -> size, "sparse_dim" -> sparse_dim, "dense_dim" -> dense_dim).as[me.shadaj.scalapy.torch.tensor.Tensor]
def asinh_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("asinh_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
// def `type`(dtype : me.shadaj.scalapy.py.None = null.asInstanceOf[me.shadaj.scalapy.py.None], non_blocking : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("type")("dtype" -> dtype, "non_blocking" -> non_blocking).as[me.shadaj.scalapy.stdlib.str]
def `type`(dtype : /* Union[builtins.str, torch._C.dtype] */ me.shadaj.scalapy.py.Any, non_blocking : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("type")("dtype" -> dtype, "non_blocking" -> non_blocking).as[me.shadaj.scalapy.torch.tensor.Tensor]
def triu_(diagonal : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("triu_")("diagonal" -> diagonal).as[me.shadaj.scalapy.torch.tensor.Tensor]
def deg2rad(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("deg2rad")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def sparse_mask(mask : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sparse_mask")("mask" -> mask).as[me.shadaj.scalapy.torch.tensor.Tensor]
def isinf(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("isinf")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def sort(dim : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], descending : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): /* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_values_indices] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sort")("dim" -> dim, "descending" -> descending).as[/* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_values_indices] */ me.shadaj.scalapy.py.Any]
/* skip conflict: sort */
def _dimV(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_dimV")().as[me.shadaj.scalapy.stdlib.int]
def tan(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("tan")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def argmin(dim : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], keepdim : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("argmin")("dim" -> dim, "keepdim" -> keepdim).as[me.shadaj.scalapy.torch.tensor.Tensor]
def index_put(indices : /* Union[builtins.tuple[torch.tensor.Tensor], builtins.list[torch.tensor.Tensor], None] */ me.shadaj.scalapy.py.Any, values : me.shadaj.scalapy.torch.tensor.Tensor, accumulate : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("index_put")("indices" -> indices, "values" -> values, "accumulate" -> accumulate).as[me.shadaj.scalapy.torch.tensor.Tensor]
def detach_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("detach_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def index_add_(dim : me.shadaj.scalapy.stdlib.int, index : me.shadaj.scalapy.torch.tensor.Tensor, source : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("index_add_")("dim" -> dim, "index" -> index, "source" -> source).as[me.shadaj.scalapy.torch.tensor.Tensor]
def fill_(member_value : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("fill_")("value" -> member_value).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: fill_ */
def argsort(dim : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], descending : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("argsort")("dim" -> dim, "descending" -> descending).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: argsort */
def _indices(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_indices")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def index_select(dim : me.shadaj.scalapy.stdlib.int, index : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("index_select")("dim" -> dim, "index" -> index).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: index_select */
def floor_divide(other : /* Union[torch.tensor.Tensor, Union[builtins.int, builtins.float, builtins.bool]] */ me.shadaj.scalapy.py.Any, out : /* Union[torch.tensor.Tensor, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("floor_divide")("other" -> other, "out" -> out).as[me.shadaj.scalapy.torch.tensor.Tensor]
def to_sparse(sparse_dim : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("to_sparse")("sparse_dim" -> sparse_dim).as[me.shadaj.scalapy.torch.tensor.Tensor]
def to_sparse(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("to_sparse")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def mv(vec : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("mv")("vec" -> vec).as[me.shadaj.scalapy.torch.tensor.Tensor]
def abs(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("abs")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def frac(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("frac")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def remainder_(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("remainder_")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: remainder_ */
def unsqueeze(dim : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("unsqueeze")("dim" -> dim).as[me.shadaj.scalapy.torch.tensor.Tensor]
def stride(): /* Tuple[builtins.int] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("stride")().as[/* Tuple[builtins.int] */ me.shadaj.scalapy.py.Any]
def stride(_int : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("stride")("_int" -> _int).as[me.shadaj.scalapy.stdlib.int]
def __rpow__(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rpow__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def resize_as_(the_template : me.shadaj.scalapy.torch.tensor.Tensor, memory_format : /* Union[torch._C.memory_format, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("resize_as_")("the_template" -> the_template, "memory_format" -> memory_format).as[me.shadaj.scalapy.torch.tensor.Tensor]
def to_dense(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("to_dense")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def cummax(dim : me.shadaj.scalapy.stdlib.int): /* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_values_indices] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("cummax")("dim" -> dim).as[/* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_values_indices] */ me.shadaj.scalapy.py.Any]
/* skip conflict: cummax */
def ne(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("ne")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: ne */
def logical_xor_(other : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("logical_xor_")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def lt(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("lt")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: lt */
def __ilshift__(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__ilshift__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: __ilshift__ */
/* skip conflict: __ilshift__ */
def byte(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("byte")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def unbind(dim : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): /* Union[builtins.tuple[torch.tensor.Tensor], builtins.list[torch.tensor.Tensor]] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("unbind")("dim" -> dim).as[/* Union[builtins.tuple[torch.tensor.Tensor], builtins.list[torch.tensor.Tensor]] */ me.shadaj.scalapy.py.Any]
/* skip conflict: unbind */
def is_meta: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("is_meta").as[me.shadaj.scalapy.stdlib.bool]
def narrow(dim : me.shadaj.scalapy.stdlib.int, start : me.shadaj.scalapy.stdlib.int, length : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("narrow")("dim" -> dim, "start" -> start, "length" -> length).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: narrow */
def sin(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sin")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def unsqueeze_(dim : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("unsqueeze_")("dim" -> dim).as[me.shadaj.scalapy.torch.tensor.Tensor]
def add(other : /* Union[torch.tensor.Tensor, Union[builtins.int, builtins.float, builtins.bool]] */ me.shadaj.scalapy.py.Any, alpha : /* Union[builtins.int, builtins.float, builtins.bool, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], out : /* Union[torch.tensor.Tensor, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("add")("other" -> other, "alpha" -> alpha, "out" -> out).as[me.shadaj.scalapy.torch.tensor.Tensor]
def numel(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("numel")().as[me.shadaj.scalapy.stdlib.int]
def nelement(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("nelement")().as[me.shadaj.scalapy.stdlib.int]
def gt(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("gt")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: gt */
def pow_(exponent : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("pow_")("exponent" -> exponent).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: pow_ */
def ormqr(input2 : me.shadaj.scalapy.torch.tensor.Tensor, input3 : me.shadaj.scalapy.torch.tensor.Tensor, left : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool], transpose : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("ormqr")("input2" -> input2, "input3" -> input3, "left" -> left, "transpose" -> transpose).as[me.shadaj.scalapy.torch.tensor.Tensor]
def exponential_(lambd : me.shadaj.scalapy.stdlib.float = null.asInstanceOf[me.shadaj.scalapy.stdlib.float], generator : /* Union[torch._C.Generator, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("exponential_")("lambd" -> lambd, "generator" -> generator).as[me.shadaj.scalapy.torch.tensor.Tensor]
def addbmm(batch1 : me.shadaj.scalapy.torch.tensor.Tensor, batch2 : me.shadaj.scalapy.torch.tensor.Tensor, beta : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], alpha : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("addbmm")("batch1" -> batch1, "batch2" -> batch2, "beta" -> beta, "alpha" -> alpha).as[me.shadaj.scalapy.torch.tensor.Tensor]
def >=(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__ge__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def fliplr(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("fliplr")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def svd(some : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool], compute_uv : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): /* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_U_S_V] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("svd")("some" -> some, "compute_uv" -> compute_uv).as[/* Tuple[torch.tensor.Tensor, torch.tensor.Tensor, torch.tensor.Tensor, fallback=torch._C.namedtuple_U_S_V] */ me.shadaj.scalapy.py.Any]
def is_distributed(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("is_distributed")().as[me.shadaj.scalapy.stdlib.bool]
def baddbmm_(batch1 : me.shadaj.scalapy.torch.tensor.Tensor, batch2 : me.shadaj.scalapy.torch.tensor.Tensor, beta : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], alpha : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("baddbmm_")("batch1" -> batch1, "batch2" -> batch2, "beta" -> beta, "alpha" -> alpha).as[me.shadaj.scalapy.torch.tensor.Tensor]
def log(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("log")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def logical_and(other : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("logical_and")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def argmax(dim : /* Union[builtins.int, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], keepdim : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("argmax")("dim" -> dim, "keepdim" -> keepdim).as[me.shadaj.scalapy.torch.tensor.Tensor]
def orgqr(input2 : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("orgqr")("input2" -> input2).as[me.shadaj.scalapy.torch.tensor.Tensor]
def diagflat(offset : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("diagflat")("offset" -> offset).as[me.shadaj.scalapy.torch.tensor.Tensor]
def eq(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("eq")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: eq */
def asinh(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("asinh")().as[me.shadaj.scalapy.torch.tensor.Tensor]
// def sum(dtype : /* Union[torch._C.dtype, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sum")("dtype" -> dtype).as[me.shadaj.scalapy.torch.tensor.Tensor]
def sum(dim : /* Union[builtins.int, Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]]] */ me.shadaj.scalapy.py.Any, keepdim : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool], dtype : /* Union[torch._C.dtype, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sum")("dim" -> dim, "keepdim" -> keepdim, "dtype" -> dtype).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: sum */
def logcumsumexp(dim : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("logcumsumexp")("dim" -> dim).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: logcumsumexp */
def is_same_size(other : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("is_same_size")("other" -> other).as[me.shadaj.scalapy.stdlib.bool]
def trunc(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("trunc")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def imag: me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("imag").as[me.shadaj.scalapy.torch.tensor.Tensor]
// def `var`(unbiased : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("var")("unbiased" -> unbiased).as[me.shadaj.scalapy.torch.tensor.Tensor]
def `var`(dim : /* Union[builtins.int, Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]]] */ me.shadaj.scalapy.py.Any, unbiased : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool], keepdim : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("var")("dim" -> dim, "unbiased" -> unbiased, "keepdim" -> keepdim).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: var */
def bitwise_or_(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("bitwise_or_")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: bitwise_or_ */
def rot90(k : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], dims : /* Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rot90")("k" -> k, "dims" -> dims).as[me.shadaj.scalapy.torch.tensor.Tensor]
def device: me.shadaj.scalapy.torch._C.device = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("device").as[me.shadaj.scalapy.torch._C.device]
def +(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__add__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def index_copy_(dim : me.shadaj.scalapy.stdlib.int, index : me.shadaj.scalapy.torch.tensor.Tensor, source : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("index_copy_")("dim" -> dim, "index" -> index, "source" -> source).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: index_copy_ */
def acos(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("acos")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def new_tensor(data : me.shadaj.scalapy.py.Any, dtype : /* Union[torch._C.dtype, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], device : /* Union[torch._C.device, builtins.str, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], requires_grad : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("new_tensor")("data" -> data, "dtype" -> dtype, "device" -> device, "requires_grad" -> requires_grad).as[me.shadaj.scalapy.torch.tensor.Tensor]
def fft(signal_ndim : me.shadaj.scalapy.stdlib.int, normalized : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("fft")("signal_ndim" -> signal_ndim, "normalized" -> normalized).as[me.shadaj.scalapy.torch.tensor.Tensor]
def is_cuda: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("is_cuda").as[me.shadaj.scalapy.stdlib.bool]
def sspaddmm(mat1 : me.shadaj.scalapy.torch.tensor.Tensor, mat2 : me.shadaj.scalapy.torch.tensor.Tensor, beta : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], alpha : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sspaddmm")("mat1" -> mat1, "mat2" -> mat2, "beta" -> beta, "alpha" -> alpha).as[me.shadaj.scalapy.torch.tensor.Tensor]
def lt_(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("lt_")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: lt_ */
def view_as(other : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("view_as")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def gather(dim : me.shadaj.scalapy.stdlib.int, index : me.shadaj.scalapy.torch.tensor.Tensor, sparse_grad : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("gather")("dim" -> dim, "index" -> index, "sparse_grad" -> sparse_grad).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: gather */
def floor_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("floor_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def tanh_(): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("tanh_")().as[me.shadaj.scalapy.torch.tensor.Tensor]
def histc(bins : me.shadaj.scalapy.stdlib.int = null.asInstanceOf[me.shadaj.scalapy.stdlib.int], min : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], max : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("histc")("bins" -> bins, "min" -> min, "max" -> max).as[me.shadaj.scalapy.torch.tensor.Tensor]
def item(): /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("item")().as[/* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any]
def view(size : /* Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("view")("size" -> size).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: view */
def __rshift__(other : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rshift__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip conflict: __rshift__ */
/* skip conflict: __rshift__ */
def irfft(signal_ndim : me.shadaj.scalapy.stdlib.int, normalized : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool], onesided : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool], signal_sizes : /* Union[torch._C.Size, builtins.list[builtins.int], builtins.tuple[builtins.int]] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("irfft")("signal_ndim" -> signal_ndim, "normalized" -> normalized, "onesided" -> onesided, "signal_sizes" -> signal_sizes).as[me.shadaj.scalapy.torch.tensor.Tensor]
def __rsub__(other : me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rsub__")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def atan2_(other : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("atan2_")("other" -> other).as[me.shadaj.scalapy.torch.tensor.Tensor]
def baddbmm(batch1 : me.shadaj.scalapy.torch.tensor.Tensor, batch2 : me.shadaj.scalapy.torch.tensor.Tensor, beta : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], alpha : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("baddbmm")("batch1" -> batch1, "batch2" -> batch2, "beta" -> beta, "alpha" -> alpha).as[me.shadaj.scalapy.torch.tensor.Tensor]
def fill_diagonal_(fill_value : /* Union[builtins.int, builtins.float, builtins.bool] */ me.shadaj.scalapy.py.Any, wrap : me.shadaj.scalapy.stdlib.bool = null.asInstanceOf[me.shadaj.scalapy.stdlib.bool]): me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("fill_diagonal_")("fill_value" -> fill_value, "wrap" -> wrap).as[me.shadaj.scalapy.torch.tensor.Tensor]
def is_set_to(tensor : me.shadaj.scalapy.torch.tensor.Tensor): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("is_set_to")("tensor" -> tensor).as[me.shadaj.scalapy.stdlib.bool]
}

object _TensorBase extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_TensorBase")) with py.Object {






































/* attribute: requires_grad */

/* attribute: is_leaf */











/* attribute: dtype */


/* attribute: _version */





/* attribute: real */






























/* attribute: is_sparse */







/* attribute: names */























/* attribute: data */






































/* attribute: is_mkldnn */













/* attribute: is_quantized */














def apply(args : me.shadaj.scalapy.py.Any, device : /* Union[torch._C.device, builtins.str, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.torch._C._TensorBase = as[me.shadaj.scalapy.py.Dynamic].applyNamed("args" -> args, "device" -> device).as[me.shadaj.scalapy.torch._C._TensorBase]
def apply(storage : me.shadaj.scalapy.torch._C.Storage): me.shadaj.scalapy.torch._C._TensorBase = as[me.shadaj.scalapy.py.Dynamic].applyNamed("storage" -> storage).as[me.shadaj.scalapy.torch._C._TensorBase]
/* skip conflict: __init__ */
/* skip conflict: __init__ */





























































































































































/* attribute: shape */



/* attribute: layout */











































/* attribute: is_meta */



























/* attribute: imag */



/* attribute: device */





/* attribute: is_cuda */
















}
@py.native trait BFloat16StorageBase extends me.shadaj.scalapy.stdlib.`object` {

}

object BFloat16StorageBase extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("BFloat16StorageBase")) with py.Object {

}
def `__doc__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__doc__").as[me.shadaj.scalapy.stdlib.str]
@py.native trait IntTensor extends me.shadaj.scalapy.torch.tensor.Tensor {

}

object IntTensor extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("IntTensor")) with py.Object {

}
@py.native trait layout extends me.shadaj.scalapy.stdlib.`object` {

}

object layout extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("layout")) with py.Object {

}
def sparse_coo: me.shadaj.scalapy.torch._C.layout = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("sparse_coo").as[me.shadaj.scalapy.torch._C.layout]
def qint32: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("qint32").as[me.shadaj.scalapy.torch._C.dtype]
@py.native trait HalfStorageBase extends me.shadaj.scalapy.stdlib.`object` {

}

object HalfStorageBase extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("HalfStorageBase")) with py.Object {

}
def has_cuda: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("has_cuda").as[me.shadaj.scalapy.stdlib.bool]
@py.native trait BoolTensor extends me.shadaj.scalapy.torch.tensor.Tensor {

}

object BoolTensor extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("BoolTensor")) with py.Object {

}
def _set_deterministic(arg : me.shadaj.scalapy.stdlib.bool): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_set_deterministic")(arg).as[me.shadaj.scalapy.py.None]
def `__file__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__file__").as[me.shadaj.scalapy.stdlib.str]
@py.native trait namedtuple_eigenvalues_eigenvectors extends me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.torch.tensor.Tensor] {
/* member: _make */
def eigenvalues: me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("eigenvalues").as[me.shadaj.scalapy.torch.tensor.Tensor]
/* skip override: __annotations__ */
def _field_defaults: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_field_defaults").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
/* skip override: __new__ */
def _field_types: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_field_types").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
/* member: _NT */
def eigenvectors: me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("eigenvectors").as[me.shadaj.scalapy.torch.tensor.Tensor]
def _asdict(): me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_asdict")().as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
/* skip override: __doc__ */
def _replace[_NT <: me.shadaj.scalapy.py.Any](eigenvalues : me.shadaj.scalapy.torch.tensor.Tensor = null.asInstanceOf[me.shadaj.scalapy.torch.tensor.Tensor], eigenvectors : me.shadaj.scalapy.torch.tensor.Tensor = null.asInstanceOf[me.shadaj.scalapy.torch.tensor.Tensor])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_NT]): _NT = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_replace")("eigenvalues" -> eigenvalues, "eigenvectors" -> eigenvectors).as[_NT]
def _fields: /* Tuple[builtins.str, builtins.str] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_fields").as[/* Tuple[builtins.str, builtins.str] */ me.shadaj.scalapy.py.Any]
def _source: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_source").as[me.shadaj.scalapy.stdlib.str]
}

object namedtuple_eigenvalues_eigenvectors extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("namedtuple_eigenvalues_eigenvectors")) with py.Object {
/* member: _make */
/* attribute: eigenvalues */
/* attribute: __annotations__ */
/* attribute: _field_defaults */

/* attribute: _field_types */
/* member: _NT */
/* attribute: eigenvectors */

/* attribute: __doc__ */

/* attribute: _fields */
/* attribute: _source */
}
def complex64: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("complex64").as[me.shadaj.scalapy.torch._C.dtype]
def _get_backcompat_broadcast_warn(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_get_backcompat_broadcast_warn")().as[me.shadaj.scalapy.stdlib.bool]
def _get_qengine(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_get_qengine")().as[me.shadaj.scalapy.stdlib.int]
@py.native trait BoolStorageBase extends me.shadaj.scalapy.stdlib.`object` {

}

object BoolStorageBase extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("BoolStorageBase")) with py.Object {

}
def strided: me.shadaj.scalapy.torch._C.layout = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("strided").as[me.shadaj.scalapy.torch._C.layout]
/* MypyFile:1(
  /nix/store/cl0ngvh4xsdl25i66cji74qa5xf8k2lc-python3.8-pytorch-1.6.0/lib/python3.8/site-packages/torch/_C/_nn.pyi) */
def cdouble: me.shadaj.scalapy.torch._C.dtype = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("cdouble").as[me.shadaj.scalapy.torch._C.dtype]
/* MypyFile:1(
  /nix/store/cl0ngvh4xsdl25i66cji74qa5xf8k2lc-python3.8-pytorch-1.6.0/lib/python3.8/site-packages/torch/_C/_onnx.pyi) */
def _set_cudnn_deterministic(arg : me.shadaj.scalapy.stdlib.bool): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_set_cudnn_deterministic")(arg).as[me.shadaj.scalapy.py.None]
@py.native trait device extends me.shadaj.scalapy.stdlib.`object` {
/* skip override: __reduce__ */
def index: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("index").as[me.shadaj.scalapy.stdlib.int]

def `type`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("type").as[me.shadaj.scalapy.stdlib.str]
}

object device extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("device")) with py.Object {

/* attribute: index */
def apply(device : /* Union[builtins.int, builtins.str] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch._C.device = as[me.shadaj.scalapy.py.Dynamic].applyNamed("device" -> device).as[me.shadaj.scalapy.torch._C.device]
def apply(`type` : me.shadaj.scalapy.stdlib.str, index : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.torch._C.device = as[me.shadaj.scalapy.py.Dynamic].applyNamed("type" -> `type`, "index" -> index).as[me.shadaj.scalapy.torch._C.device]
/* attribute: type */
}
def _get_mkldnn_enabled(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_get_mkldnn_enabled")().as[me.shadaj.scalapy.stdlib.bool]
@py.native trait namedtuple_sign_logabsdet extends me.shadaj.scalapy.stdlib.tuple[me.shadaj.scalapy.torch.tensor.Tensor] {
/* member: _make */
/* skip override: __annotations__ */
def _field_defaults: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_field_defaults").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
/* skip override: __new__ */
/* member: _NT */
def sign: me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("sign").as[me.shadaj.scalapy.torch.tensor.Tensor]
def _asdict(): me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_asdict")().as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
/* skip override: __doc__ */
def _replace[_NT <: me.shadaj.scalapy.py.Any](sign : me.shadaj.scalapy.torch.tensor.Tensor = null.asInstanceOf[me.shadaj.scalapy.torch.tensor.Tensor], logabsdet : me.shadaj.scalapy.torch.tensor.Tensor = null.asInstanceOf[me.shadaj.scalapy.torch.tensor.Tensor])(implicit retReader: me.shadaj.scalapy.readwrite.Reader[_NT]): _NT = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_replace")("sign" -> sign, "logabsdet" -> logabsdet).as[_NT]
def _fields: /* Tuple[builtins.str, builtins.str] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_fields").as[/* Tuple[builtins.str, builtins.str] */ me.shadaj.scalapy.py.Any]
def _source: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_source").as[me.shadaj.scalapy.stdlib.str]
def _field_types: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_field_types").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.stdlib.str, me.shadaj.scalapy.py.Any]]
def logabsdet: me.shadaj.scalapy.torch.tensor.Tensor = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("logabsdet").as[me.shadaj.scalapy.torch.tensor.Tensor]
}

object namedtuple_sign_logabsdet extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("namedtuple_sign_logabsdet")) with py.Object {
/* member: _make */
/* attribute: __annotations__ */
/* attribute: _field_defaults */

/* member: _NT */
/* attribute: sign */

/* attribute: __doc__ */

/* attribute: _fields */
/* attribute: _source */
/* attribute: _field_types */
/* attribute: logabsdet */
}
def _set_backcompat_broadcast_warn(arg : me.shadaj.scalapy.stdlib.bool): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_set_backcompat_broadcast_warn")(arg).as[me.shadaj.scalapy.py.None]
@py.native trait ShortTensor extends me.shadaj.scalapy.torch.tensor.Tensor {

}

object ShortTensor extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ShortTensor")) with py.Object {

}
@py.native trait FileCheck extends me.shadaj.scalapy.stdlib.`object` {

}

object FileCheck extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("FileCheck")) with py.Object {

}
}
