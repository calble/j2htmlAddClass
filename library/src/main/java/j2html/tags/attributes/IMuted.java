package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IMuted<T extends Tag<T>> extends IInstance<T>  {
default T isMuted() {self().attr("muted");
return self();
}
default T withCondMuted(final boolean enable) {if (enable){
self().attr("muted");
}
return self();
}
}
