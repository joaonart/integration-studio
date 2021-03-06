/**
 * <copyright>
 * </copyright>
 * 
 * $Id$
 */
package org.wso2.integrationstudio.eclipse.ds.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.wso2.integrationstudio.eclipse.ds.DsFactory;
import org.wso2.integrationstudio.eclipse.ds.DsPackage;
import org.wso2.integrationstudio.eclipse.ds.EventTrigger;

/**
 * This is the item provider adapter for a {@link org.wso2.integrationstudio.eclipse.ds.EventTrigger} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EventTriggerItemProvider extends ItemProviderAdapter implements
                                                                 IEditingDomainItemProvider,
                                                                 IStructuredItemContentProvider,
                                                                 ITreeItemContentProvider,
                                                                 IItemLabelProvider,
                                                                 IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTriggerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addLanguagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EventTrigger_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EventTrigger_id_feature", "_UI_EventTrigger_type"),
				 DsPackage.Literals.EVENT_TRIGGER__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EventTrigger_language_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EventTrigger_language_feature", "_UI_EventTrigger_type"),
				 DsPackage.Literals.EVENT_TRIGGER__LANGUAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to
	 * deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand},
	 * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in
	 * {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			// childrenFeatures.add(DsPackage.Literals.EVENT_TRIGGER__MIXED);
			childrenFeatures.add(DsPackage.Literals.EVENT_TRIGGER__EXPRESSION);
			childrenFeatures.add(DsPackage.Literals.EVENT_TRIGGER__TARGET_TOPIC);
			childrenFeatures.add(DsPackage.Literals.EVENT_TRIGGER__SUBSCRIPTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns EventTrigger.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */

	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("wso2/event-trigger"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */

	@Override
	public String getText(Object object) {
		String label = ((EventTrigger) object).getId();
		String type = " (" + getString("_UI_EventTrigger_type") + ")";
		return label != null ? label.toString() + type : type;

	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EventTrigger.class)) {
			case DsPackage.EVENT_TRIGGER__ID:
			case DsPackage.EVENT_TRIGGER__LANGUAGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DsPackage.EVENT_TRIGGER__MIXED:
			case DsPackage.EVENT_TRIGGER__EXPRESSION:
			case DsPackage.EVENT_TRIGGER__TARGET_TOPIC:
			case DsPackage.EVENT_TRIGGER__SUBSCRIPTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DsPackage.Literals.EVENT_TRIGGER__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(DsPackage.Literals.EVENT_TRIGGER__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(DsPackage.Literals.EVENT_TRIGGER__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
					 XMLTypeFactory.eINSTANCE.createProcessingInstruction())));

		newChildDescriptors.add
			(createChildParameter
				(DsPackage.Literals.EVENT_TRIGGER__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(DsPackage.Literals.EVENT_TRIGGER__MIXED,
				 FeatureMapUtil.createEntry
					(DsPackage.Literals.EVENT_TRIGGER__EXPRESSION,
					 DsFactory.eINSTANCE.createExpression())));

		newChildDescriptors.add
			(createChildParameter
				(DsPackage.Literals.EVENT_TRIGGER__MIXED,
				 FeatureMapUtil.createEntry
					(DsPackage.Literals.EVENT_TRIGGER__TARGET_TOPIC,
					 DsFactory.eINSTANCE.createTargetTopic())));

		newChildDescriptors.add
			(createChildParameter
				(DsPackage.Literals.EVENT_TRIGGER__MIXED,
				 FeatureMapUtil.createEntry
					(DsPackage.Literals.EVENT_TRIGGER__SUBSCRIPTIONS,
					 DsFactory.eINSTANCE.createEventSubscriptionList())));

		newChildDescriptors.add
			(createChildParameter
				(DsPackage.Literals.EVENT_TRIGGER__EXPRESSION,
				 DsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DsPackage.Literals.EVENT_TRIGGER__TARGET_TOPIC,
				 DsFactory.eINSTANCE.createTargetTopic()));

		newChildDescriptors.add
			(createChildParameter
				(DsPackage.Literals.EVENT_TRIGGER__SUBSCRIPTIONS,
				 DsFactory.eINSTANCE.createEventSubscriptionList()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child,
	                                 Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == DsPackage.Literals.EVENT_TRIGGER__EXPRESSION ||
			childFeature == DsPackage.Literals.EVENT_TRIGGER__TARGET_TOPIC ||
			childFeature == DsPackage.Literals.EVENT_TRIGGER__SUBSCRIPTIONS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public ResourceLocator getResourceLocator() {
		return DsEditPlugin.INSTANCE;
	}

}
