package me.shadaj.scalapy
import me.shadaj.scalapy.py
package object numbers extends me.shadaj.scalapy.py.StaticModule("numbers") {
@py.native trait Real extends me.shadaj.scalapy.numbers.Complex with me.shadaj.scalapy.typing.SupportsFloat {
/* member: __floordiv__ */
/* member: __rfloordiv__ */
/* member: real */
/* member: __floor__ */
/* skip override: conjugate */
/* skip override: __complex__ */
/* member: __mod__ */
/* member: __ceil__ */
/* member: __le__ */
/* member: __float__ */
def __rdivmod__(other : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rdivmod__")("other" -> other).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def __divmod__(other : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__divmod__")("other" -> other).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def __round__(ndigits : me.shadaj.scalapy.py.None = null.asInstanceOf[me.shadaj.scalapy.py.None]): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__round__")("ndigits" -> ndigits).as[me.shadaj.scalapy.py.Any]
/* skip conflict: __round__ */
/* member: __lt__ */
/* member: __rmod__ */
/* member: imag */
/* member: __trunc__ */
}

object Real extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Real")) with py.Object {
  implicit def fromDouble(d: Double) = (d: py.Any).as[Real]
/* member: __floordiv__ */
/* member: __rfloordiv__ */
/* member: real */
/* member: __floor__ */


/* member: __mod__ */
/* member: __ceil__ */
/* member: __le__ */
/* member: __float__ */



/* member: __lt__ */
/* member: __rmod__ */
/* member: imag */
/* member: __trunc__ */
}
@py.native trait Number extends me.shadaj.scalapy.stdlib.`object` {
/* member: __hash__ */
}

object Number extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Number")) with py.Object {
/* member: __hash__ */
}
@py.native trait Complex extends me.shadaj.scalapy.numbers.Number {
def -(other : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__sub__")("other" -> other).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* member: __radd__ */
/* member: real */
def conjugate(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("conjugate")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* member: __rtruediv__ */
/* member: __complex__ */
/* member: __pow__ */
/* member: __rmul__ */
/* member: __truediv__ */
def __abs__(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__abs__")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* member: __rpow__ */
/* member: __pos__ */
def __rsub__(other : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rsub__")("other" -> other).as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* skip override: __eq__ */
def __bool__(): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__bool__")().as[me.shadaj.scalapy.stdlib.bool]
/* member: __mul__ */
/* member: __neg__ */
/* member: imag */
/* member: __add__ */
}

object Complex extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Complex")) with py.Object {

/* member: __radd__ */
/* member: real */

/* member: __rtruediv__ */
/* member: __complex__ */
/* member: __pow__ */
/* member: __rmul__ */
/* member: __truediv__ */

/* member: __rpow__ */
/* member: __pos__ */



/* member: __mul__ */
/* member: __neg__ */
/* member: imag */
/* member: __add__ */
}
def `__package__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__package__").as[me.shadaj.scalapy.stdlib.str]
def `__name__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__name__").as[me.shadaj.scalapy.stdlib.str]
@py.native trait Integral extends me.shadaj.scalapy.numbers.Rational {
/* member: __and__ */
/* member: denominator */
/* member: __int__ */
def __index__(): me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__index__")().as[me.shadaj.scalapy.stdlib.int]
/* member: __pow__ */
/* member: __lshift__ */
/* member: __rxor__ */
/* member: __rshift__ */
/* member: __xor__ */
/* member: __invert__ */
/* member: __rlshift__ */
/* member: __rrshift__ */
/* member: __rand__ */
/* member: __or__ */
/* member: numerator */
/* skip override: __float__ */
/* member: __ror__ */
}

object Integral extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Integral")) with py.Object {
/* member: __and__ */
/* member: denominator */
/* member: __int__ */

/* member: __pow__ */
/* member: __lshift__ */
/* member: __rxor__ */
/* member: __rshift__ */
/* member: __xor__ */
/* member: __invert__ */
/* member: __rlshift__ */
/* member: __rrshift__ */
/* member: __rand__ */
/* member: __or__ */
/* member: numerator */

/* member: __ror__ */
}
def `__doc__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__doc__").as[me.shadaj.scalapy.stdlib.str]
@py.native trait Rational extends me.shadaj.scalapy.numbers.Real {
/* skip override: __float__ */
/* member: denominator */
/* member: numerator */
}

object Rational extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Rational")) with py.Object {

/* member: denominator */
/* member: numerator */
}
def `__file__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__file__").as[me.shadaj.scalapy.stdlib.str]
}
