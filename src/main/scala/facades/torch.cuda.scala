package me.shadaj.scalapy.torch
import me.shadaj.scalapy.py
package object cuda extends me.shadaj.scalapy.py.StaticModule("torch.cuda") {
def _check_capability(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_check_capability")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def current_stream(device : /* Union[torch._C.device, builtins.str, builtins.int, None] */ me.shadaj.scalapy.py.Any): /* TypeInfo(
  Name(torch.cuda.streams.Stream)
  Bases(torch._C._CudaStreamBase)
  Mro(torch.cuda.streams.Stream, torch._C._CudaStreamBase, builtins.object)
  Names(
    __eq__
    __hash__
    __new__
    __repr__
    _as_parameter_
    query
    record_event
    synchronize
    wait_event
    wait_stream)) */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("current_stream")(device).as[/* TypeInfo(
  Name(torch.cuda.streams.Stream)
  Bases(torch._C._CudaStreamBase)
  Mro(torch.cuda.streams.Stream, torch._C._CudaStreamBase, builtins.object)
  Names(
    __eq__
    __hash__
    __new__
    __repr__
    _as_parameter_
    query
    record_event
    synchronize
    wait_event
    wait_stream)) */ me.shadaj.scalapy.py.Any]
def device_count(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("device_count")().as[me.shadaj.scalapy.stdlib.int]
def get_arch_list(): me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.str] = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("get_arch_list")().as[me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.stdlib.str]]
def cudart(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("cudart")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
@py.native trait CudaError extends me.shadaj.scalapy.stdlib.RuntimeError {

}

object CudaError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("CudaError")) with py.Object {
def apply(code : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.torch.cuda.CudaError = as[me.shadaj.scalapy.py.Dynamic].applyNamed("code" -> code).as[me.shadaj.scalapy.torch.cuda.CudaError]
}
/* <mypy.nodes.TypeAlias object at 0x7f866c49e9c0> */
def _queued_calls: me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.py.Any] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_queued_calls").as[me.shadaj.scalapy.stdlib.list[me.shadaj.scalapy.py.Any]]
@py.native trait device extends me.shadaj.scalapy.stdlib.`object` {
def __enter__(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__enter__")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]

def prev_idx: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("prev_idx").as[me.shadaj.scalapy.py.Any]
def idx: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("idx").as[me.shadaj.scalapy.py.Any]
def __exit__(args : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__exit__")("args" -> args).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
}

object device extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("device")) with py.Object {

def apply(device : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyNamed("device" -> device).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* attribute: prev_idx */
/* attribute: idx */

}
def get_device_capability(device : /* Union[torch._C.device, builtins.str, builtins.int, None] */ me.shadaj.scalapy.py.Any): /* Tuple[builtins.int, builtins.int] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("get_device_capability")(device).as[/* Tuple[builtins.int, builtins.int] */ me.shadaj.scalapy.py.Any]
def is_available(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_available")().as[me.shadaj.scalapy.stdlib.bool]
def _sleep(cycles : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_sleep")(cycles).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* MypyFile:1(
  /nix/store/cl0ngvh4xsdl25i66cji74qa5xf8k2lc-python3.8-pytorch-1.6.0/lib/python3.8/site-packages/torch/cuda/sparse.py) */
def default_generators: /* Tuple[torch._C.Generator] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("default_generators").as[/* Tuple[torch._C.Generator] */ me.shadaj.scalapy.py.Any]
/* MypyFile:1(
  /nix/store/cl0ngvh4xsdl25i66cji74qa5xf8k2lc-python3.8-pytorch-1.6.0/lib/python3.8/site-packages/torch/cuda/profiler.py) */
def _initialization_lock: /* TypeInfo(
  Name(threading.Lock)
  Bases(builtins.object)
  Mro(threading.Lock, builtins.object)
  Names(
    __enter__
    __exit__
    __init__
    acquire
    locked
    release)) */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_initialization_lock").as[/* TypeInfo(
  Name(threading.Lock)
  Bases(builtins.object)
  Mro(threading.Lock, builtins.object)
  Names(
    __enter__
    __exit__
    __init__
    acquire
    locked
    release)) */ me.shadaj.scalapy.py.Any]
def ipc_collect(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("ipc_collect")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def _lazy_init(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_lazy_init")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
@py.native trait cudaStatus extends me.shadaj.scalapy.stdlib.`object` {
def SUCCESS: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("SUCCESS").as[me.shadaj.scalapy.stdlib.int]
def ERROR_NOT_READY: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ERROR_NOT_READY").as[me.shadaj.scalapy.stdlib.int]
}

object cudaStatus extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("cudaStatus")) with py.Object {
/* attribute: SUCCESS */
/* attribute: ERROR_NOT_READY */
}
@py.native trait ComplexDoubleStorage extends me.shadaj.scalapy.torch.cuda._CudaBase with me.shadaj.scalapy.torch.storage._StorageBase {
  override def is_cuda: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_cuda")().as[me.shadaj.scalapy.stdlib.bool]
  override def is_sparse: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_sparse")().as[me.shadaj.scalapy.stdlib.bool]
}

object ComplexDoubleStorage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ComplexDoubleStorage")) with py.Object {

}
/* <mypy.nodes.TypeAlias object at 0x7f866c49e940> */
def t: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("t").as[me.shadaj.scalapy.stdlib.str]
def get_device_properties(device : /* Union[torch._C.device, builtins.str, builtins.int] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.torch._C._CudaDeviceProperties = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("get_device_properties")(device).as[me.shadaj.scalapy.torch._C._CudaDeviceProperties]
def _initialized: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_initialized").as[me.shadaj.scalapy.stdlib.bool]
@py.native trait BoolStorage extends me.shadaj.scalapy.torch.cuda._CudaBase with me.shadaj.scalapy.torch.storage._StorageBase {
  override def is_cuda: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_cuda")().as[me.shadaj.scalapy.stdlib.bool]
  override def is_sparse: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_sparse")().as[me.shadaj.scalapy.stdlib.bool]
}

object BoolStorage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("BoolStorage")) with py.Object {

}
def _check_driver(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_check_driver")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def synchronize(device : /* Union[torch._C.device, builtins.str, builtins.int, None] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("synchronize")(device).as[me.shadaj.scalapy.py.None]
@py.native trait ShortStorage extends me.shadaj.scalapy.torch.cuda._CudaBase with me.shadaj.scalapy.torch.storage._StorageBase {
  override def is_cuda: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_cuda")().as[me.shadaj.scalapy.stdlib.bool]
  override def is_sparse: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_sparse")().as[me.shadaj.scalapy.stdlib.bool]
}

object ShortStorage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ShortStorage")) with py.Object {

}
def _lazy_call(callable : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_lazy_call")(callable).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def get_gencode_flags(): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("get_gencode_flags")().as[me.shadaj.scalapy.stdlib.str]
def is_initialized(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_initialized")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* MypyFile:1(
  /nix/store/cl0ngvh4xsdl25i66cji74qa5xf8k2lc-python3.8-pytorch-1.6.0/lib/python3.8/site-packages/torch/cuda/amp/__init__.py) */
@py.native trait device_of extends me.shadaj.scalapy.torch.cuda.device {

}

object device_of extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("device_of")) with py.Object {
def apply(obj : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyNamed("obj" -> obj).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
}
def get_device_name(device : /* Union[torch._C.device, builtins.str, builtins.int, None] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("get_device_name")(device).as[me.shadaj.scalapy.stdlib.str]
@py.native trait DeferredCudaCallError extends me.shadaj.scalapy.stdlib.Exception {

}

object DeferredCudaCallError extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("DeferredCudaCallError")) with py.Object {

}
def current_blas_handle(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("current_blas_handle")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
@py.native trait ByteStorage extends me.shadaj.scalapy.torch.cuda._CudaBase with me.shadaj.scalapy.torch.storage._StorageBase {
  override def is_cuda: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_cuda")().as[me.shadaj.scalapy.stdlib.bool]
  override def is_sparse: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_sparse")().as[me.shadaj.scalapy.stdlib.bool]
}

object ByteStorage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ByteStorage")) with py.Object {

}
def _check_cubins(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_check_cubins")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
@py.native trait LongStorage extends me.shadaj.scalapy.torch.cuda._CudaBase with me.shadaj.scalapy.torch.storage._StorageBase {
  override def is_cuda: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_cuda")().as[me.shadaj.scalapy.stdlib.bool]
  override def is_sparse: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_sparse")().as[me.shadaj.scalapy.stdlib.bool]
}

object LongStorage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("LongStorage")) with py.Object {

}
@py.native trait CharStorage extends me.shadaj.scalapy.torch.cuda._CudaBase with me.shadaj.scalapy.torch.storage._StorageBase {
  override def is_cuda: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_cuda")().as[me.shadaj.scalapy.stdlib.bool]
  override def is_sparse: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_sparse")().as[me.shadaj.scalapy.stdlib.bool]
}

object CharStorage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("CharStorage")) with py.Object {

}
@py.native trait BFloat16Storage extends me.shadaj.scalapy.torch.cuda._CudaBase with me.shadaj.scalapy.torch.storage._StorageBase {
  override def is_cuda: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_cuda")().as[me.shadaj.scalapy.stdlib.bool]
  override def is_sparse: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_sparse")().as[me.shadaj.scalapy.stdlib.bool]
}

object BFloat16Storage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("BFloat16Storage")) with py.Object {

}
/* MypyFile:1(
  /nix/store/cl0ngvh4xsdl25i66cji74qa5xf8k2lc-python3.8-pytorch-1.6.0/lib/python3.8/site-packages/torch/cuda/nvtx.py) */
/* Decorator:475(
  Var(_lazy_new)
  FuncDef:476(
    _lazy_new
    Args(
      Var(cls))
    VarArg(
      Var(args))
    DictVarArg(
      Var(kwargs))
    Static
    Block:476())) */
/* Decorator:321(
  Var(stream)
  MemberExpr:321(
    NameExpr(contextlib)
    contextmanager [contextlib.contextmanager])
  FuncDef:322(
    stream
    Args(
      Var(stream))
    Generator
    Block:322())) */
def set_device(device : /* Union[torch._C.device, builtins.str, builtins.int] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("set_device")(device).as[me.shadaj.scalapy.py.None]
def _cudart: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_cudart").as[me.shadaj.scalapy.py.Any]
@py.native trait DoubleStorage extends me.shadaj.scalapy.torch.cuda._CudaBase with me.shadaj.scalapy.torch.storage._StorageBase {
  override def is_cuda: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_cuda")().as[me.shadaj.scalapy.stdlib.bool]
  override def is_sparse: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_sparse")().as[me.shadaj.scalapy.stdlib.bool]
}

object DoubleStorage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("DoubleStorage")) with py.Object {

}
def tensor_name: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("tensor_name").as[me.shadaj.scalapy.stdlib.str]
def _is_in_bad_fork: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_is_in_bad_fork").as[me.shadaj.scalapy.py.Any]
def `__package__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__package__").as[me.shadaj.scalapy.stdlib.str]
def _tls: /* TypeInfo(
  Name(threading.local)
  Bases(builtins.object)
  Mro(threading.local, builtins.object)
  Names(
    __delattr__
    __getattribute__
    __setattr__)) */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_tls").as[/* TypeInfo(
  Name(threading.local)
  Bases(builtins.object)
  Mro(threading.local, builtins.object)
  Names(
    __delattr__
    __getattribute__
    __setattr__)) */ me.shadaj.scalapy.py.Any]
def `__name__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__name__").as[me.shadaj.scalapy.stdlib.str]
@py.native trait FloatStorage extends me.shadaj.scalapy.torch.cuda._CudaBase with me.shadaj.scalapy.torch.storage._StorageBase {
  override def is_cuda: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_cuda")().as[me.shadaj.scalapy.stdlib.bool]
  override def is_sparse: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_sparse")().as[me.shadaj.scalapy.stdlib.bool]
}

object FloatStorage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("FloatStorage")) with py.Object {

}
def default_stream(device : /* Union[torch._C.device, builtins.str, builtins.int, None] */ me.shadaj.scalapy.py.Any): /* TypeInfo(
  Name(torch.cuda.streams.Stream)
  Bases(torch._C._CudaStreamBase)
  Mro(torch.cuda.streams.Stream, torch._C._CudaStreamBase, builtins.object)
  Names(
    __eq__
    __hash__
    __new__
    __repr__
    _as_parameter_
    query
    record_event
    synchronize
    wait_event
    wait_stream)) */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("default_stream")(device).as[/* TypeInfo(
  Name(torch.cuda.streams.Stream)
  Bases(torch._C._CudaStreamBase)
  Mro(torch.cuda.streams.Stream, torch._C._CudaStreamBase, builtins.object)
  Names(
    __eq__
    __hash__
    __new__
    __repr__
    _as_parameter_
    query
    record_event
    synchronize
    wait_event
    wait_stream)) */ me.shadaj.scalapy.py.Any]
def storage_name: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("storage_name").as[me.shadaj.scalapy.stdlib.str]
def current_device(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("current_device")().as[me.shadaj.scalapy.stdlib.int]
def has_half: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("has_half").as[me.shadaj.scalapy.stdlib.bool]
@py.native trait HalfStorage extends me.shadaj.scalapy.torch.cuda._CudaBase with me.shadaj.scalapy.torch.storage._StorageBase {
  override def is_cuda: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_cuda")().as[me.shadaj.scalapy.stdlib.bool]
  override def is_sparse: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_sparse")().as[me.shadaj.scalapy.stdlib.bool]
}

object HalfStorage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("HalfStorage")) with py.Object {

}
def `__doc__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__doc__").as[me.shadaj.scalapy.stdlib.str]
def has_magma: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("has_magma").as[me.shadaj.scalapy.stdlib.bool]
def `__file__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__file__").as[me.shadaj.scalapy.stdlib.str]
@py.native trait ComplexFloatStorage extends me.shadaj.scalapy.torch.cuda._CudaBase with me.shadaj.scalapy.torch.storage._StorageBase {
  override def is_cuda: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_cuda")().as[me.shadaj.scalapy.stdlib.bool]
  override def is_sparse: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_sparse")().as[me.shadaj.scalapy.stdlib.bool]
}

object ComplexFloatStorage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ComplexFloatStorage")) with py.Object {

}
@py.native trait _CudaBase extends me.shadaj.scalapy.stdlib.`object` {
def is_cuda: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("is_cuda").as[me.shadaj.scalapy.stdlib.bool]
/* skip override: __new__ */
def is_sparse: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("is_sparse").as[me.shadaj.scalapy.stdlib.bool]
def `type`(args : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, kwargs : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("type")("args" -> args, "kwargs" -> kwargs).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
}

object _CudaBase extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_CudaBase")) with py.Object {
/* attribute: is_cuda */
/* attribute: __new__ */
/* attribute: is_sparse */

}
def init(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("init")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
@py.native trait IntStorage extends me.shadaj.scalapy.torch.cuda._CudaBase with me.shadaj.scalapy.torch.storage._StorageBase {
  override def is_cuda: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_cuda")().as[me.shadaj.scalapy.stdlib.bool]
  override def is_sparse: me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("is_sparse")().as[me.shadaj.scalapy.stdlib.bool]
}

object IntStorage extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("IntStorage")) with py.Object {

}
def check_error(res : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.py.None = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("check_error")(res).as[me.shadaj.scalapy.py.None]
}
