package me.shadaj.scalapy.torch
import me.shadaj.scalapy.py
package object tensor extends me.shadaj.scalapy.py.StaticModule("torch.tensor") {
def _wrap_type_error_to_not_implemented(f : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamic("_wrap_type_error_to_not_implemented")(f).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def `__doc__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__doc__").as[me.shadaj.scalapy.stdlib.str]
def `__file__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__file__").as[me.shadaj.scalapy.stdlib.str]
@py.native trait Tensor extends me.shadaj.scalapy.torch._C._TensorBase {
def unflatten(dim : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, namedshape : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("unflatten")("dim" -> dim, "namedshape" -> namedshape).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* member: __floordiv__ */
/* skip override: rename_ */
def reinforce(reward : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("reinforce")("reward" -> reward).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* skip override: __itruediv__ */
/* skip override: __le__ */
def __rdiv__(other : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rdiv__")("other" -> other).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* skip override: __abs__ */
def lu(pivot : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, get_infos : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("lu")("pivot" -> pivot, "get_infos" -> get_infos).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def __setstate__(state : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__setstate__")("state" -> state).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def refine_names(names : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("refine_names")("names" -> names).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* skip override: __eq__ */
def align_to(names : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("align_to")("names" -> names).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* skip override: __repr__ */
def __contains__(element : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__contains__")("element" -> element).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* member: __rfloordiv__ */
/* skip override: __ne__ */
/* skip override: __lt__ */
def unique_consecutive(return_inverse : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, return_counts : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, dim : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("unique_consecutive")("return_inverse" -> return_inverse, "return_counts" -> return_counts, "dim" -> dim).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* member: __cuda_array_interface__ */
/* skip override: __rtruediv__ */
def __iter__(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__iter__")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* skip override: __dir__ */
/* skip override: backward */
/* skip override: __neg__ */
def is_shared(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("is_shared")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def rename(names : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, rename_map : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rename")("names" -> names, "rename_map" -> rename_map).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def grad(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("grad")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def grad_=(new_grad : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("grad")(new_grad)
/* skip conflict: grad */
/* skip override: detach */
def resize(sizes : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("resize")("sizes" -> sizes).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def _grad: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_grad").as[me.shadaj.scalapy.py.Any]
def _update_names(names : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, inplace : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("_update_names")("names" -> names, "inplace" -> inplace).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def stft(n_fft : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, hop_length : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, win_length : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, window : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, center : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, pad_mode : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, normalized : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, onesided : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("stft")("n_fft" -> n_fft, "hop_length" -> hop_length, "win_length" -> win_length, "window" -> window, "center" -> center, "pad_mode" -> pad_mode, "normalized" -> normalized, "onesided" -> onesided).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def __len__(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__len__")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def _backward_hooks: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("_backward_hooks").as[me.shadaj.scalapy.py.Any]
def share_memory_(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("share_memory_")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def retains_grad: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("retains_grad").as[me.shadaj.scalapy.py.Any]
def __ipow__(other : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__ipow__")("other" -> other).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def `__array_priority__`: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__array_priority__").as[me.shadaj.scalapy.stdlib.int]
def norm(p : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, dim : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, keepdim : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, dtype : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("norm")("p" -> p, "dim" -> dim, "keepdim" -> keepdim, "dtype" -> dtype).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def retain_grad(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("retain_grad")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def register_hook(hook : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("register_hook")("hook" -> hook).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* skip override: __gt__ */
def split(split_size : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, dim : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("split")("split_size" -> split_size, "dim" -> dim).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* skip override: __format__ */
/* skip override: __pow__ */
def __array__(dtype : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__array__")("dtype" -> dtype).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def __reversed__(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__reversed__")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def __array_wrap__(array : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__array_wrap__")("array" -> array).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* skip override: detach_ */
/* member: __rpow__ */
def __deepcopy__(memo : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__deepcopy__")("memo" -> memo).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* skip override: __reduce_ex__ */
def resize_as(tensor : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("resize_as")("tensor" -> tensor).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* skip override: __module__ */
/* skip override: __ge__ */
def istft(n_fft : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, hop_length : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, win_length : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, window : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, center : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, normalized : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, onesided : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, length : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("istft")("n_fft" -> n_fft, "hop_length" -> hop_length, "win_length" -> win_length, "window" -> window, "center" -> center, "normalized" -> normalized, "onesided" -> onesided, "length" -> length).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def unique(sorted : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, return_inverse : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, return_counts : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any, dim : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("unique")("sorted" -> sorted, "return_inverse" -> return_inverse, "return_counts" -> return_counts, "dim" -> dim).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* skip override: __hash__ */
/* skip override: __rsub__ */
}

object Tensor extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Tensor")) with py.Object {

/* member: __floordiv__ */


/* attribute: __itruediv__ */
/* attribute: __le__ */

/* attribute: __abs__ */



/* attribute: __eq__ */



/* member: __rfloordiv__ */
/* attribute: __ne__ */
/* attribute: __lt__ */

/* member: __cuda_array_interface__ */
/* attribute: __rtruediv__ */



/* attribute: __neg__ */



/* attribute: detach */

/* attribute: _grad */



/* attribute: _backward_hooks */

/* attribute: retains_grad */

/* attribute: __array_priority__ */



/* attribute: __gt__ */


/* attribute: __pow__ */



/* attribute: detach_ */
/* member: __rpow__ */



/* attribute: __module__ */
/* attribute: __ge__ */




}
def `__package__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__package__").as[me.shadaj.scalapy.stdlib.str]
def `__name__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__name__").as[me.shadaj.scalapy.stdlib.str]
}
