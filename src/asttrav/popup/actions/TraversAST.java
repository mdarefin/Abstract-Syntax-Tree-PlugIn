package asttrav.popup.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.jdt.core.*;


public class TraversAST implements IObjectActionDelegate {

	private Shell shell;
	
	/**
	 * Constructor for Action1.
	 */
	public TraversAST() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		MessageDialog.openInformation(
			shell,
			"ASTTrav",
			"Traverse AST was executed.");
	}
	
	//This variable holds the object on which the menu was invoked
	private ISelection selection;
	//This method converts a Selection to an object
	public static Object getSingleElement(ISelection s) {
	if (!(s instanceof IStructuredSelection))
	return null;
	IStructuredSelection selection = (IStructuredSelection) s;
	if (selection.size() != 1)
	return null;
	return selection.getFirstElement();
	}
	//Converts an object to an IMethod
	private IMethod getSelectedMethod(Object element) {
	IMethod method = null;
	if (element instanceof IMethod) {
	method = (IMethod) element;
	}
	return method;
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

}
