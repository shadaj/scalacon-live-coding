package me.shadaj.scalapy.mip
import me.shadaj.scalapy.py
package object entities extends me.shadaj.scalapy.py.StaticModule("mip.entities") {
@py.native trait Column extends me.shadaj.scalapy.stdlib.`object` {
/* skip override: __str__ */
/* skip override: __slots__ */

def constrs: me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("constrs").as[me.shadaj.scalapy.py.Any]
def coeffs: /* Union[builtins.list[numbers.Real], None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("coeffs").as[/* Union[builtins.list[numbers.Real], None] */ me.shadaj.scalapy.py.Any]
}

object Column extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Column")) with py.Object {

/* attribute: __slots__ */
def apply(constrs : me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], coeffs : /* Union[builtins.list[numbers.Real], None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.mip.entities.Column = as[me.shadaj.scalapy.py.Dynamic].applyNamed("constrs" -> constrs, "coeffs" -> coeffs).as[me.shadaj.scalapy.mip.entities.Column]
/* attribute: constrs */
/* attribute: coeffs */
}
@py.native trait Var extends me.shadaj.scalapy.stdlib.`object` {
def -(other : /* Union[mip.entities.Var, mip.entities.LinExpr, numbers.Real] */ me.shadaj.scalapy.py.Any): /* Union[mip.entities.Var, mip.entities.LinExpr] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__sub__")("other" -> other).as[/* Union[mip.entities.Var, mip.entities.LinExpr] */ me.shadaj.scalapy.py.Any]
/* member: model */
/* skip override: __slots__ */
def obj(): me.shadaj.scalapy.numbers.Real = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("obj")().as[me.shadaj.scalapy.numbers.Real]
def obj_=(member_value : me.shadaj.scalapy.numbers.Real): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("obj")(member_value)
def __float__(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__float__")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def __rmul__(other : me.shadaj.scalapy.numbers.Real): /* Union[mip.entities.Var, numbers.Real, mip.entities.LinExpr] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rmul__")("other" -> other).as[/* Union[mip.entities.Var, numbers.Real, mip.entities.LinExpr] */ me.shadaj.scalapy.py.Any]
def column(): me.shadaj.scalapy.mip.entities.Column = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("column")().as[me.shadaj.scalapy.mip.entities.Column]
def column_=(member_value : me.shadaj.scalapy.mip.entities.Column): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("column")(member_value)
def ub(): me.shadaj.scalapy.numbers.Real = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("ub")().as[me.shadaj.scalapy.numbers.Real]
def ub_=(member_value : me.shadaj.scalapy.numbers.Real): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("ub")(member_value)
def +(other : /* Union[mip.entities.Var, mip.entities.LinExpr, numbers.Real] */ me.shadaj.scalapy.py.Any): /* Union[mip.entities.Var, mip.entities.LinExpr] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__add__")("other" -> other).as[/* Union[mip.entities.Var, mip.entities.LinExpr] */ me.shadaj.scalapy.py.Any]
def __radd__(other : /* Union[mip.entities.Var, mip.entities.LinExpr, numbers.Real] */ me.shadaj.scalapy.py.Any): /* Union[mip.entities.Var, mip.entities.LinExpr] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__radd__")("other" -> other).as[/* Union[mip.entities.Var, mip.entities.LinExpr] */ me.shadaj.scalapy.py.Any]
/* member: x */
/* member: name */
def lb(): me.shadaj.scalapy.numbers.Real = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("lb")().as[me.shadaj.scalapy.numbers.Real]
def lb_=(member_value : me.shadaj.scalapy.numbers.Real): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("lb")(member_value)
/* skip override: __eq__ */
/* skip override: __str__ */
def *(other : me.shadaj.scalapy.numbers.Real): /* Union[mip.entities.Var, numbers.Real, mip.entities.LinExpr] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__mul__")("other" -> other).as[/* Union[mip.entities.Var, numbers.Real, mip.entities.LinExpr] */ me.shadaj.scalapy.py.Any]
def __neg__(): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__neg__")().as[me.shadaj.scalapy.mip.entities.LinExpr]

def __model: me.shadaj.scalapy.mip.model.Model = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__model").as[me.shadaj.scalapy.mip.model.Model]
def <=(other : /* Union[mip.entities.Var, mip.entities.LinExpr, numbers.Real] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__le__")("other" -> other).as[me.shadaj.scalapy.mip.entities.LinExpr]
def /(other : me.shadaj.scalapy.numbers.Real): /* Union[mip.entities.Var, numbers.Real, mip.entities.LinExpr] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__truediv__")("other" -> other).as[/* Union[mip.entities.Var, numbers.Real, mip.entities.LinExpr] */ me.shadaj.scalapy.py.Any]
def idx: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("idx").as[me.shadaj.scalapy.stdlib.int]
def xi(i : me.shadaj.scalapy.stdlib.int): /* Union[numbers.Real, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("xi")("i" -> i).as[/* Union[numbers.Real, None] */ me.shadaj.scalapy.py.Any]
def var_type(): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("var_type")().as[me.shadaj.scalapy.stdlib.str]
def var_type_=(member_value : me.shadaj.scalapy.stdlib.str): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("var_type")(member_value)
def >=(other : /* Union[mip.entities.Var, mip.entities.LinExpr, numbers.Real] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__ge__")("other" -> other).as[me.shadaj.scalapy.mip.entities.LinExpr]
/* member: rc */
/* skip override: __hash__ */
def __rsub__(other : /* Union[mip.entities.Var, mip.entities.LinExpr, numbers.Real] */ me.shadaj.scalapy.py.Any): /* Union[mip.entities.Var, mip.entities.LinExpr] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rsub__")("other" -> other).as[/* Union[mip.entities.Var, mip.entities.LinExpr] */ me.shadaj.scalapy.py.Any]
}

object Var extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Var")) with py.Object {

/* member: model */
/* attribute: __slots__ */







/* member: x */
/* member: name */





def apply(model : me.shadaj.scalapy.mip.model.Model, idx : me.shadaj.scalapy.stdlib.int): me.shadaj.scalapy.mip.entities.Var = as[me.shadaj.scalapy.py.Dynamic].applyNamed("model" -> model, "idx" -> idx).as[me.shadaj.scalapy.mip.entities.Var]
/* attribute: __model */


/* attribute: idx */



/* member: rc */


}
@py.native trait Constr extends me.shadaj.scalapy.stdlib.`object` {
def rhs(): me.shadaj.scalapy.numbers.Real = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("rhs")().as[me.shadaj.scalapy.numbers.Real]
def rhs_=(rhs : me.shadaj.scalapy.numbers.Real): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("rhs")(rhs)
/* skip override: __slots__ */
def __priority: /* Union[mip.constants.ConstraintPriority, None] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__priority").as[/* Union[mip.constants.ConstraintPriority, None] */ me.shadaj.scalapy.py.Any]
def expr(): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("expr")().as[me.shadaj.scalapy.mip.entities.LinExpr]
def expr_=(member_value : me.shadaj.scalapy.mip.entities.LinExpr): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("expr")(member_value)

def __model: me.shadaj.scalapy.mip.model.Model = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__model").as[me.shadaj.scalapy.mip.model.Model]
/* member: slack */
def idx: me.shadaj.scalapy.stdlib.int = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("idx").as[me.shadaj.scalapy.stdlib.int]
/* skip override: __hash__ */
/* member: name */
def priority(): me.shadaj.scalapy.mip.constants.ConstraintPriority = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("priority")().as[me.shadaj.scalapy.mip.constants.ConstraintPriority]
def priority_=(priority : me.shadaj.scalapy.mip.constants.ConstraintPriority): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("priority")(priority)
/* member: pi */
/* skip override: __str__ */
}

object Constr extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("Constr")) with py.Object {

/* attribute: __slots__ */
/* attribute: __priority */

def apply(model : me.shadaj.scalapy.mip.model.Model, idx : me.shadaj.scalapy.stdlib.int, priority : /* Union[mip.constants.ConstraintPriority, None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any]): me.shadaj.scalapy.mip.entities.Constr = as[me.shadaj.scalapy.py.Dynamic].applyNamed("model" -> model, "idx" -> idx, "priority" -> priority).as[me.shadaj.scalapy.mip.entities.Constr]
/* attribute: __model */
/* member: slack */
/* attribute: idx */

/* member: name */

/* member: pi */

}
def `__doc__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__doc__").as[me.shadaj.scalapy.stdlib.str]
def `__file__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__file__").as[me.shadaj.scalapy.stdlib.str]
@py.native trait LinExpr extends me.shadaj.scalapy.stdlib.`object` {
def -(other : /* Union[mip.entities.Var, mip.entities.LinExpr, numbers.Real] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__sub__")("other" -> other).as[me.shadaj.scalapy.mip.entities.LinExpr]
def __imul__(other : me.shadaj.scalapy.numbers.Real): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__imul__")("other" -> other).as[me.shadaj.scalapy.mip.entities.LinExpr]
/* member: model */
/* skip override: __slots__ */
def __isub__(other : /* Union[mip.entities.Var, mip.entities.LinExpr, numbers.Real] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__isub__")("other" -> other).as[me.shadaj.scalapy.mip.entities.LinExpr]
/* member: expr */
def sense(): me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("sense")().as[me.shadaj.scalapy.stdlib.str]
def sense_=(member_value : /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any): Unit = as[me.shadaj.scalapy.py.Dynamic].updateDynamic("sense")(member_value)
def add_var(`var` : me.shadaj.scalapy.mip.entities.Var, coeff : me.shadaj.scalapy.numbers.Real = null.asInstanceOf[me.shadaj.scalapy.numbers.Real]): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("add_var")("var" -> `var`, "coeff" -> coeff).as[me.shadaj.scalapy.py.Any]
def __rmul__(other : me.shadaj.scalapy.numbers.Real): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rmul__")("other" -> other).as[me.shadaj.scalapy.mip.entities.LinExpr]
/* member: violation */
def __const: me.shadaj.scalapy.numbers.Real = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__const").as[me.shadaj.scalapy.numbers.Real]
def >=(other : /* Union[mip.entities.Var, mip.entities.LinExpr, numbers.Real] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__ge__")("other" -> other).as[me.shadaj.scalapy.mip.entities.LinExpr]
def __radd__(other : /* Union[mip.entities.Var, mip.entities.LinExpr, numbers.Real] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__radd__")("other" -> other).as[me.shadaj.scalapy.mip.entities.LinExpr]
/* member: x */
/* skip override: __eq__ */
/* skip override: __str__ */
def equals(other : me.shadaj.scalapy.mip.entities.LinExpr): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("equals")("other" -> other).as[me.shadaj.scalapy.stdlib.bool]
def add_const(`val` : me.shadaj.scalapy.numbers.Real): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("add_const")("val" -> `val`).as[me.shadaj.scalapy.py.Any]
def __itruediv__(other : me.shadaj.scalapy.numbers.Real): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__itruediv__")("other" -> other).as[me.shadaj.scalapy.mip.entities.LinExpr]
def set_expr(expr : me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.mip.entities.Var, me.shadaj.scalapy.numbers.Real]): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("set_expr")("expr" -> expr).as[me.shadaj.scalapy.py.Any]
def *(other : me.shadaj.scalapy.numbers.Real): /* Union[mip.entities.LinExpr, numbers.Real] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__mul__")("other" -> other).as[/* Union[mip.entities.LinExpr, numbers.Real] */ me.shadaj.scalapy.py.Any]
def __neg__(): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__neg__")().as[me.shadaj.scalapy.mip.entities.LinExpr]
def __iadd__(other : /* Union[mip.entities.Var, mip.entities.LinExpr, numbers.Real] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__iadd__")("other" -> other).as[me.shadaj.scalapy.mip.entities.LinExpr]

def __sense: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__sense").as[me.shadaj.scalapy.stdlib.str]
def <=(other : /* Union[mip.entities.Var, mip.entities.LinExpr, numbers.Real] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__le__")("other" -> other).as[me.shadaj.scalapy.mip.entities.LinExpr]
def __len__(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__len__")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
def __float__(): /* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__float__")().as[/* <class 'mypy.types.AnyType'> */ me.shadaj.scalapy.py.Any]
/* member: const */
def add_term(term : /* Union[mip.entities.Var, mip.entities.LinExpr, numbers.Real] */ me.shadaj.scalapy.py.Any, coeff : me.shadaj.scalapy.numbers.Real = null.asInstanceOf[me.shadaj.scalapy.numbers.Real]): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("add_term")("term" -> term, "coeff" -> coeff).as[me.shadaj.scalapy.py.Any]
def copy(): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("copy")().as[me.shadaj.scalapy.mip.entities.LinExpr]
def /(other : me.shadaj.scalapy.numbers.Real): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__truediv__")("other" -> other).as[me.shadaj.scalapy.mip.entities.LinExpr]
def add_expr(expr : me.shadaj.scalapy.mip.entities.LinExpr, coeff : me.shadaj.scalapy.numbers.Real = null.asInstanceOf[me.shadaj.scalapy.numbers.Real]): me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("add_expr")("expr" -> expr, "coeff" -> coeff).as[me.shadaj.scalapy.py.Any]
def +(other : /* Union[mip.entities.Var, mip.entities.LinExpr, numbers.Real] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__add__")("other" -> other).as[me.shadaj.scalapy.mip.entities.LinExpr]
def __expr: me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.mip.entities.Var, me.shadaj.scalapy.numbers.Real] = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__expr").as[me.shadaj.scalapy.stdlib.dict[me.shadaj.scalapy.mip.entities.Var, me.shadaj.scalapy.numbers.Real]]
/* skip override: __hash__ */
def __rsub__(other : /* Union[mip.entities.Var, mip.entities.LinExpr, numbers.Real] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("__rsub__")("other" -> other).as[me.shadaj.scalapy.mip.entities.LinExpr]
}

object LinExpr extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("LinExpr")) with py.Object {


/* member: model */
/* attribute: __slots__ */

/* member: expr */



/* member: violation */
/* attribute: __const */


/* member: x */









def apply(variables : /* Union[builtins.list[mip.entities.Var], None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], coeffs : /* Union[builtins.list[numbers.Real], None] */ me.shadaj.scalapy.py.Any = null.asInstanceOf[me.shadaj.scalapy.py.Any], const : me.shadaj.scalapy.numbers.Real = null.asInstanceOf[me.shadaj.scalapy.numbers.Real], sense : me.shadaj.scalapy.stdlib.str = null.asInstanceOf[me.shadaj.scalapy.stdlib.str]): me.shadaj.scalapy.mip.entities.LinExpr = as[me.shadaj.scalapy.py.Dynamic].applyNamed("variables" -> variables, "coeffs" -> coeffs, "const" -> const, "sense" -> sense).as[me.shadaj.scalapy.mip.entities.LinExpr]
/* attribute: __sense */



/* member: const */





/* attribute: __expr */


}
def `__name__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__name__").as[me.shadaj.scalapy.stdlib.str]
@py.native trait ConflictGraph extends me.shadaj.scalapy.stdlib.`object` {
def model: me.shadaj.scalapy.mip.model.Model = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("model").as[me.shadaj.scalapy.mip.model.Model]
/* skip override: __slots__ */

/* member: density */
def conflicting(e1 : /* Union[mip.entities.LinExpr, mip.entities.Var] */ me.shadaj.scalapy.py.Any, e2 : /* Union[mip.entities.LinExpr, mip.entities.Var] */ me.shadaj.scalapy.py.Any): me.shadaj.scalapy.stdlib.bool = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("conflicting")("e1" -> e1, "e2" -> e2).as[me.shadaj.scalapy.stdlib.bool]
def conflicting_assignments(v : /* Union[mip.entities.LinExpr, mip.entities.Var] */ me.shadaj.scalapy.py.Any): /* Tuple[builtins.list[mip.entities.Var], builtins.list[mip.entities.Var]] */ me.shadaj.scalapy.py.Any = as[me.shadaj.scalapy.py.Dynamic].applyDynamicNamed("conflicting_assignments")("v" -> v).as[/* Tuple[builtins.list[mip.entities.Var], builtins.list[mip.entities.Var]] */ me.shadaj.scalapy.py.Any]
}

object ConflictGraph extends me.shadaj.scalapy.py.StaticValue(as[me.shadaj.scalapy.py.Dynamic].selectDynamic("ConflictGraph")) with py.Object {
/* attribute: model */
/* attribute: __slots__ */
def apply(model : me.shadaj.scalapy.mip.model.Model): me.shadaj.scalapy.mip.entities.ConflictGraph = as[me.shadaj.scalapy.py.Dynamic].applyNamed("model" -> model).as[me.shadaj.scalapy.mip.entities.ConflictGraph]
/* member: density */


}
def `__package__`: me.shadaj.scalapy.stdlib.str = as[me.shadaj.scalapy.py.Dynamic].selectDynamic("__package__").as[me.shadaj.scalapy.stdlib.str]
}
