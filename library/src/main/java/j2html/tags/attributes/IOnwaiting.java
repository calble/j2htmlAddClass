package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IOnwaiting<T extends Tag<T>> extends IInstance<T>  {
default T withOnwaiting(final String onwaiting_) {return self().attr("onwaiting", onwaiting_);
}
default T withCondOnwaiting(final boolean enable, final String onwaiting_) {if (enable){
self().attr("onwaiting", onwaiting_);
}
return self();
}
}
