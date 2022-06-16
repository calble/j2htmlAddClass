package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IDatetime<T extends Tag<T>> extends IInstance<T>  {
default T withDatetime(final String datetime_) {return self().attr("datetime", datetime_);
}
default T withCondDatetime(final boolean enable, final String datetime_) {if (enable){
self().attr("datetime", datetime_);
}
return self();
}
}
