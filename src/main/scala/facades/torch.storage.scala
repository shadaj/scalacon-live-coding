package me.shadaj.scalapy.torch
import me.shadaj.scalapy.py
package object storage extends me.shadaj.scalapy.py.StaticModule("torch.storage") {
def _load_from_bytes(b : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_load_from_bytes")(b).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def `__doc__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__doc__").as[me.shadaj.scalapy.stdlib.str]
def `__file__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__file__").as[me.shadaj.scalapy.stdlib.str]
@py.native trait _StorageBase extends me.shadaj.scalapy.stdlib.`object` {
def bfloat16(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("bfloat16")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def short(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("short")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* skip override: __sizeof__ */
def __iter__(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__iter__")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def char(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("char")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def complex_double(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("complex_double")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def long(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("long")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* skip illegal name: clone */
def __copy__(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__copy__")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def __deepcopy__(memo : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__deepcopy__")("memo" -> memo).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def byte(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("byte")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* skip override: __reduce__ */
def is_cuda: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("is_cuda").as[me.shadaj.scalapy.stdlib.bool]
def pin_memory(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("pin_memory")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* skip override: __str__ */
/* skip override: __repr__ */
def tolist(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("tolist")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* member: _new_shared */
def complex_float(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("complex_float")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def float(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("float")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def is_sparse: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("is_sparse").as[me.shadaj.scalapy.stdlib.bool]
def half(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("half")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def double(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("double")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def share_memory_(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("share_memory_")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def bool(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("bool")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def int(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("int")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def cpu(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("cpu")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
}

object _StorageBase extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_StorageBase")) with py.Object {












/* attribute: is_cuda */




/* member: _new_shared */


/* attribute: is_sparse */






}
def `__package__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__package__").as[me.shadaj.scalapy.stdlib.str]
def `__name__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__name__").as[me.shadaj.scalapy.stdlib.str]
}
