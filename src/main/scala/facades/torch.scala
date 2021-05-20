package me.shadaj.scalapy
import me.shadaj.scalapy.py
package object torch extends me.shadaj.scalapy.py.StaticModule("torch") {
def is_tensor(obj : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_tensor")(obj).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* MypyFile:1(
  /nix/store/cl0ngvh4xsdl25i66cji74qa5xf8k2lc-python3.8-pytorch-1.6.0/lib/python3.8/site-packages/torch/_C/__init__.pyi
  IgnoredLines(284, 287, 289, 336, 344, 348)) */
def set_default_dtype(d : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("set_default_dtype")(d).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
@py.native trait QInt8Storage extends me.shadaj.scalapy.torch._C.QInt8StorageBase with me.shadaj.scalapy.torch.storage._StorageBase {

}

object QInt8Storage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("QInt8Storage")) with py.Object {

}
@py.native trait QUInt8Storage extends me.shadaj.scalapy.torch._C.QUInt8StorageBase with me.shadaj.scalapy.torch.storage._StorageBase {

}

object QUInt8Storage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("QUInt8Storage")) with py.Object {

}
@py.native trait QInt32Storage extends me.shadaj.scalapy.torch._C.QInt32StorageBase with me.shadaj.scalapy.torch.storage._StorageBase {

}

object QInt32Storage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("QInt32Storage")) with py.Object {

}
def is_storage(obj : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_storage")(obj).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
@py.native trait DoubleStorage extends me.shadaj.scalapy.torch._C.DoubleStorageBase with me.shadaj.scalapy.torch.storage._StorageBase {

}

object DoubleStorage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("DoubleStorage")) with py.Object {

}
def name: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("name").as[me.shadaj.scalapy.stdlib.str]
def typename(o : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("typename")(o).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def manager_path(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("manager_path")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
@py.native trait ComplexDoubleStorage extends me.shadaj.scalapy.torch._C.ComplexDoubleStorageBase with me.shadaj.scalapy.torch.storage._StorageBase {

}

object ComplexDoubleStorage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ComplexDoubleStorage")) with py.Object {

}
def old_flags: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("old_flags").as[me.shadaj.scalapy.stdlib.int]
def _storage_classes: me.shadaj.scalapy.stdlib.set[me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_storage_classes").as[me.shadaj.scalapy.stdlib.set[me.shadaj.scalapy.py.Any]]
@py.native trait BoolStorage extends me.shadaj.scalapy.torch._C.BoolStorageBase with me.shadaj.scalapy.torch.storage._StorageBase {

}

object BoolStorage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("BoolStorage")) with py.Object {

}
@py.native trait ShortStorage extends me.shadaj.scalapy.torch._C.ShortStorageBase with me.shadaj.scalapy.torch.storage._StorageBase {

}

object ShortStorage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ShortStorage")) with py.Object {

}
/* MypyFile:1(
  /nix/store/cl0ngvh4xsdl25i66cji74qa5xf8k2lc-python3.8-pytorch-1.6.0/lib/python3.8/site-packages/torch/_torch_docs.py) */
@py.native trait ByteStorage extends me.shadaj.scalapy.torch._C.ByteStorageBase with me.shadaj.scalapy.torch.storage._StorageBase {

}

object ByteStorage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ByteStorage")) with py.Object {

}
@py.native trait LongStorage extends me.shadaj.scalapy.torch._C.LongStorageBase with me.shadaj.scalapy.torch.storage._StorageBase {

}

object LongStorage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("LongStorage")) with py.Object {

}
@py.native trait CharStorage extends me.shadaj.scalapy.torch._C.CharStorageBase with me.shadaj.scalapy.torch.storage._StorageBase {

}

object CharStorage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("CharStorage")) with py.Object {

}
def `__all__`: me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.str] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__all__").as[me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.str]]
@py.native trait BFloat16Storage extends me.shadaj.scalapy.torch._C.BFloat16StorageBase with me.shadaj.scalapy.torch.storage._StorageBase {

}

object BFloat16Storage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("BFloat16Storage")) with py.Object {

}
def compiled_with_cxx11_abi(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("compiled_with_cxx11_abi")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def _tensor_classes: me.shadaj.scalapy.stdlib.set[/* Type[Any] */ me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_tensor_classes").as[me.shadaj.scalapy.stdlib.set[/* Type[Any] */ me.shadaj.scalapy.py.Any]]
def quantized_gru: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("quantized_gru").as[me.shadaj.scalapy.py.Any]
def `__package__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__package__").as[me.shadaj.scalapy.stdlib.str]
def `__name__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__name__").as[me.shadaj.scalapy.stdlib.str]
@py.native trait FloatStorage extends me.shadaj.scalapy.torch._C.FloatStorageBase with me.shadaj.scalapy.torch.storage._StorageBase {

}

object FloatStorage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("FloatStorage")) with py.Object {

}
def _is_deterministic(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_is_deterministic")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def set_default_tensor_type(t : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("set_default_tensor_type")(t).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def _load_global_deps(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_load_global_deps")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
@py.native trait HalfStorage extends me.shadaj.scalapy.torch._C.HalfStorageBase with me.shadaj.scalapy.torch.storage._StorageBase {

}

object HalfStorage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("HalfStorage")) with py.Object {

}
def `__doc__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__doc__").as[me.shadaj.scalapy.stdlib.str]
def _set_deterministic(d : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_set_deterministic")(d).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def `__file__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__file__").as[me.shadaj.scalapy.stdlib.str]
/* MypyFile:1(
  /nix/store/cl0ngvh4xsdl25i66cji74qa5xf8k2lc-python3.8-pytorch-1.6.0/lib/python3.8/site-packages/torch/_storage_docs.py) */
def legacy_contiguous_format: me.shadaj.scalapy.torch._C.memory_format = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("legacy_contiguous_format").as[me.shadaj.scalapy.torch._C.memory_format]
@py.native trait IntStorage extends me.shadaj.scalapy.torch._C.IntStorageBase with me.shadaj.scalapy.torch.storage._StorageBase {

}

object IntStorage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("IntStorage")) with py.Object {

}
@py.native trait ComplexFloatStorage extends me.shadaj.scalapy.torch._C.ComplexFloatStorageBase with me.shadaj.scalapy.torch.storage._StorageBase {

}

object ComplexFloatStorage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ComplexFloatStorage")) with py.Object {

}
def quantized_lstm: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("quantized_lstm").as[me.shadaj.scalapy.py.Any]
/* MypyFile:1(
  /nix/store/cl0ngvh4xsdl25i66cji74qa5xf8k2lc-python3.8-pytorch-1.6.0/lib/python3.8/site-packages/torch/_tensor_docs.py) */
}
