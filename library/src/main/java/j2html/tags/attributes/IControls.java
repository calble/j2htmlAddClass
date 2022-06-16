package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IControls<T extends Tag<T>> extends IInstance<T>  {
default T isControls() {self().attr("controls");
return self();
}
default T withCondControls(final boolean enable) {if (enable){
self().attr("controls");
}
return self();
}
}
