package j2html.tags.specialized;

import j2html.tags.ContainerTag;
import j2html.tags.attributes.*;

public class FieldsetTag extends ContainerTag<FieldsetTag> 
implements IDisabled<FieldsetTag>,IForm<FieldsetTag>,IName<FieldsetTag> {
public FieldsetTag() {super("fieldset");}
}
